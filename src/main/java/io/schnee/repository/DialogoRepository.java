package io.schnee.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import io.schnee.entity.Dialogo;

public interface DialogoRepository extends JpaRepository<Dialogo, UUID>{

}
