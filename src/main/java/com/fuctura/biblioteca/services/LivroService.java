package com.fuctura.biblioteca.services;

import com.fuctura.biblioteca.Models.Livro;
import com.fuctura.biblioteca.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livrosRepository;

    public Livro salvarLivro(Livro livro){
        return livrosRepository.save(livro);
    }
}
