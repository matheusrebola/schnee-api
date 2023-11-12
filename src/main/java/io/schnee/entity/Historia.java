package io.schnee.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_historia")
public class Historia {
	@Id
	@GeneratedValue
	@Column(name="cd_historia")
	private UUID id;
}
