package com.udemy.demoajax.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.demoajax.domain.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
