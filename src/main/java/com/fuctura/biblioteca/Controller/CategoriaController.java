package com.fuctura.biblioteca.Controller;

import com.fuctura.biblioteca.Models.Livro;
import com.fuctura.biblioteca.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
@Autowired
private CategoriaRepository categoriaRepository;





   // public ResponseEntity getAllCategoria(){
       // return ResponseEntity.ok("Ola mundo");


}
