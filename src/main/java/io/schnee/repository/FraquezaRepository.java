package io.schnee.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.schnee.entity.Fraqueza;

@Repository
public interface FraquezaRepository extends JpaRepository<Fraqueza, UUID>{

}
