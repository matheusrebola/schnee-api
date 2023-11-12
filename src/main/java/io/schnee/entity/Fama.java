package io.schnee.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_fama")
public class Fama {
	@Id
	private UUID id;
}
