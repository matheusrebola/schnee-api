package io.schnee.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.schnee.entity.Quest;

@Repository
public interface QuestRepository extends JpaRepository<Quest, UUID>{

}
