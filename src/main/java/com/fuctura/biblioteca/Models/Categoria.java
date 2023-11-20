package com.fuctura.biblioteca.Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Categoria {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;

    private String descricao;
@OneToMany(mappedBy = "categoria")
    private List<Livro> livros = new ArrayList<>();

    public Categoria() {
    }

    public Categoria(int id, String nome, String descrcao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descrcao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


}
