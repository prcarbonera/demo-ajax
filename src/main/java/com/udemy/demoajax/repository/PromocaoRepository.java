package com.udemy.demoajax.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.demoajax.domain.Promocao;

public interface PromocaoRepository extends JpaRepository<Promocao, Long> {

}
