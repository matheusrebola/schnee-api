package io.schnee.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.schnee.entity.Dialogo;

@Repository
public interface DialogoRepository extends JpaRepository<Dialogo, UUID>{

}
