package io.schnee.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.schnee.entity.Recompensa;

@Repository
public interface RecompensaRepository extends JpaRepository<Recompensa, UUID>{

}
