package io.schnee.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import io.schnee.entity.Historia;

public interface HistoriaRepository extends JpaRepository<Historia, UUID>{

}
