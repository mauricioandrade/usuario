package com.mauricioandrade.usuario.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository <com.mauricioandrade.usuario.infrastructure.entity.Endereco, Long> {
}
