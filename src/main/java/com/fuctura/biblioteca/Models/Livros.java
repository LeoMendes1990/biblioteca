package com.fuctura.biblioteca.Models;


import com.fuctura.biblioteca.enums.Tamanho;

import javax.persistence.*;


@Entity
public class Livros {
@Id
@GeneratedValue
    private Integer id;
    private String titulo;
    private String nome_autor;
    private String texto;

    private Tamanho tamanho;
@ManyToOne
@JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Livros() {
    }

    public Livros(Integer id, String titulo, String nome_autor, String texto, Tamanho tamanho, Categoria categoria) {
        this.id = id;
        this.titulo = titulo;
        this.nome_autor = nome_autor;
        this.texto = texto;
        this.tamanho = tamanho;
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNome_autor() {
        return nome_autor;
    }

    public void setNome_autor(String nome_autor) {
        this.nome_autor = nome_autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }
}
