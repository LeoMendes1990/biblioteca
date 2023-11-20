package com.fuctura.biblioteca.repositories;

import com.fuctura.biblioteca.Models.Livros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivrosRepository extends JpaRepository<Livros, Integer> {
}
