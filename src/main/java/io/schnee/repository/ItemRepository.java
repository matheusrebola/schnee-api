package io.schnee.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import io.schnee.entity.Item;

public interface ItemRepository extends JpaRepository<Item, UUID>{

}
