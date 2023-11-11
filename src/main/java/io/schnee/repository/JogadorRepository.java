package io.schnee.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import io.schnee.entity.Jogador;

public interface JogadorRepository extends JpaRepository<Jogador, UUID>{

}
