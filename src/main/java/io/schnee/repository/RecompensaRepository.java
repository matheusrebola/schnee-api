package io.schnee.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import io.schnee.entity.Recompensa;

public interface RecompensaRepository extends JpaRepository<Recompensa, UUID>{

}
