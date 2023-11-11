package com.fuctura.biblioteca.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Categoria {
    @Id
    @GeneratedValue
    private int id;
    private String nome;

    private String descrcao;

    private List<Livros> livros = new ArrayList<>();



}
