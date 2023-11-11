package io.schnee.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import io.schnee.entity.Especie;

public interface EspecieRepository extends JpaRepository<Especie, UUID>{

}
