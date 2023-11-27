package com.fuctura.biblioteca.Controller;

import com.fuctura.biblioteca.Models.Categoria;
import com.fuctura.biblioteca.Models.Livro;
import com.fuctura.biblioteca.repositories.CategoriaRepository;
import com.fuctura.biblioteca.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private CategoriaService categoriaService;

    //@GetMapping("/{id}") = buscar por id
    //@GetMapping() = buscar todos
    //@PostMapping(obj) = inserir no banco
    //@PutMapping(obj) = atualizar no banco
    //@DeleteMapping(id) = deletar por id

    @GetMapping(value = "/{id}")

    public Categoria findById(@PathVariable Integer id){

        Categoria obj = categoriaService.findByid(id);
        return obj;
    }
    @GetMapping
    public List<Categoria> findAll(){
        List<Categoria> list = categoriaService.findAll();
        return list;
    }

    @PostMapping
    public Categoria save(@RequestBody Categoria categoria){
        return categoriaService.save(categoria);
    }







}
