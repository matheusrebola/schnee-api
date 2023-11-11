package io.schnee.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import io.schnee.entity.Combate;

public interface CombateRepository extends JpaRepository<Combate, UUID>{

}
