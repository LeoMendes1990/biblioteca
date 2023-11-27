package com.fuctura.biblioteca;

import com.fuctura.biblioteca.Controller.LivroController;
import com.fuctura.biblioteca.Models.Livro;
import com.fuctura.biblioteca.enums.Tamanho;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BibliotecaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);


		System.out.println("Conectado");
	}



}
