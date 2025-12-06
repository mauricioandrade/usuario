package com.mauricioandrade.usuario.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository <com.mauricioandrade.usuario.infrastructure.entity.Telefone, Long> {
}
