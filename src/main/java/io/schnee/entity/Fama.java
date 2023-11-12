package io.schnee.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_fama")
public class Fama {
	@Id
	@GeneratedValue
	@Column(name="cd_fama")
	private UUID id;
}
