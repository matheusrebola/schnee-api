package io.schnee.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import io.schnee.entity.Fama;

public interface FamaRepository extends JpaRepository<Fama, UUID>{

}
