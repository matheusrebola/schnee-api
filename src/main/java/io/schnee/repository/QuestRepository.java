package io.schnee.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import io.schnee.entity.Quest;

public interface QuestRepository extends JpaRepository<Quest, UUID>{

}
