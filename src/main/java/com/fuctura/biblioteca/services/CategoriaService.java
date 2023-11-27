package com.fuctura.biblioteca.services;

import com.fuctura.biblioteca.Models.Categoria;
import com.fuctura.biblioteca.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria findByid(Integer id) {
        Optional<Categoria> obj = categoriaRepository.findById(id);
        return obj.orElse(null);
    }

    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    public Categoria save(Categoria categoria){
        return categoriaRepository.save(categoria) ;
    }
    public void CategoriaDelete(Integer id){
         categoriaRepository.deleteById(id);
    }

   public Categoria updateCategoria(Categoria categoria, Integer id){
        categoria.setId(id);
        return categoriaRepository.save(categoria);
   }
}
