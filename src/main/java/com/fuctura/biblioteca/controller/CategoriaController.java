package com.fuctura.biblioteca.controller;

import com.fuctura.biblioteca.configs.ModelMapperConfig;
import com.fuctura.biblioteca.dtos.CategoriaDTO;
import com.fuctura.biblioteca.models.Categoria;
import com.fuctura.biblioteca.repositories.CategoriaRepository;
import com.fuctura.biblioteca.services.CategoriaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;
    @Autowired
    private ModelMapper modelMapper;

    //@GetMapping("/{id}") = buscar por id
    //@GetMapping() = buscar todos
    //@PostMapping(obj) = inserir no banco
    //@PutMapping(obj) = atualizar no banco
    //@DeleteMapping(id) = deletar por id

    @GetMapping(value = "/{id}")

    public ResponseEntity<CategoriaDTO> findById(@PathVariable Integer id) {

        Categoria cat = categoriaService.findByid(id);
        return ResponseEntity.ok().body(modelMapper.map(cat, CategoriaDTO.class));
    }

    @GetMapping
    public ResponseEntity<List<CategoriaDTO>> findAll() {
        List<Categoria> list = categoriaService.findAll();
        return ResponseEntity.ok().body(list.stream().map(obj -> modelMapper.map(obj, CategoriaDTO.class)).collect(Collectors.toList()));
    }

    @PostMapping
    public ResponseEntity<CategoriaDTO> save(@RequestBody CategoriaDTO categoriaDTO) {
       Categoria cat = categoriaService.save(categoriaDTO);
       return ResponseEntity.ok().body(modelMapper.map(cat, CategoriaDTO.class));
    }

    @DeleteMapping("/{id}")

    // pra quer servi @PathVariable

    public void categoriaDelete(@PathVariable Integer id) {
        categoriaService.CategoriaDelete(id);

    }

    //pra quer servi @RequestBody
    @PutMapping("/{id}")
    public Categoria updateCategoria(@PathVariable Integer id, @RequestBody Categoria categoria){
        return categoriaService.updateCategoria(categoria,id);



    }


}
