package io.schnee.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import io.schnee.entity.Poder;

public interface PoderRepository extends JpaRepository<Poder, UUID>{

}
