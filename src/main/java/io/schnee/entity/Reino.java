package io.schnee.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_reino")
public class Reino {
	@Id
	private UUID id;
}
