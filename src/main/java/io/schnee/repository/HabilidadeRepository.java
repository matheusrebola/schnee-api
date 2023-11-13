package io.schnee.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.schnee.entity.Habilidade;

@Repository
public interface HabilidadeRepository extends JpaRepository<Habilidade, UUID>{

}
