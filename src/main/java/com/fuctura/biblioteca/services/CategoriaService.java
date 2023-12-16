package com.fuctura.biblioteca.services;

import com.fuctura.biblioteca.dtos.CategoriaDTO;
import com.fuctura.biblioteca.exceptions.IllegalArgumentException;
import com.fuctura.biblioteca.exceptions.ObjectNotFoundException;
import com.fuctura.biblioteca.models.Categoria;
import com.fuctura.biblioteca.repositories.CategoriaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    ModelMapper modelMapper;

    @Autowired
    private CategoriaRepository categoriaRepository;
// perguntar o por que o metedo se escreve com o nome da classe
    public Categoria findByid(Integer id) {

        // o que essa classe Optional faz
        Optional<Categoria> obj = categoriaRepository.findById(id);

        return obj.orElseThrow(() -> new ObjectNotFoundException("Categoria não encontrada!"));



    }

    public List<Categoria> findAll() {

        return categoriaRepository.findAll();
    }

    public Categoria save(CategoriaDTO objDTO){
        findByNome(objDTO);
        objDTO.setId(null);

        return categoriaRepository.save(modelMapper.map(objDTO, Categoria.class)) ;
    }
    public void CategoriaDelete(Integer id){
         categoriaRepository.deleteById(id);
    }

   public Categoria updateCategoria(Categoria categoria, Integer id){
        categoria.setId(id);
        return categoriaRepository.save(categoria);
   }

   public void findByNome(CategoriaDTO categoriaDTO){
        Optional<Categoria> cat = categoriaRepository.findByNome(categoriaDTO.getNome());
        if(cat.isPresent() && cat.get().getNome().equals(categoriaDTO.getNome())){
            throw new IllegalArgumentException("Já Existe Uma Categoria Com Este Nome" + categoriaDTO.getNome());
        }
   }
}
