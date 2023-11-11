package io.schnee.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import io.schnee.entity.Localidade;

public interface LocalidadeRepository extends JpaRepository<Localidade, UUID>{

}
