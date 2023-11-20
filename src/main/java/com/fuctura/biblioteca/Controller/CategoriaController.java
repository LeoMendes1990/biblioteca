package com.fuctura.biblioteca.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @GetMapping

    public ResponseEntity getAllCategoria(){
        return ResponseEntity.ok("Ola mundo");
    }

}
