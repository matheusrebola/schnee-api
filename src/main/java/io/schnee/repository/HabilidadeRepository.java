package io.schnee.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import io.schnee.entity.Habilidade;

public interface HabilidadeRepository extends JpaRepository<Habilidade, UUID>{

}
