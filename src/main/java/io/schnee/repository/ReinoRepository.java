package io.schnee.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import io.schnee.entity.Reino;

public interface ReinoRepository extends JpaRepository<Reino, UUID>{

}
