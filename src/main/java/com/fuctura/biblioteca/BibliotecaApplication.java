package com.fuctura.biblioteca;

import com.fuctura.biblioteca.Controller.LivroController;
import com.fuctura.biblioteca.Models.Livro;
import com.fuctura.biblioteca.enums.Tamanho;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BibliotecaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);


		Livro livro = new Livro();

		livro.setTitulo("Leo");
		livro.setTexto("ola");
		livro.setNome_autor("Leonardo");
		livro.setTamanho(Tamanho.MEDIO);
		LivroController livroController = new LivroController();
		livroController.adicionarLivro(livro);

		System.out.println("Conectado");
	}



}
