package io.schnee.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import io.schnee.entity.Personagem;

public interface PersonagemRepository extends JpaRepository<Personagem, UUID>{

}
