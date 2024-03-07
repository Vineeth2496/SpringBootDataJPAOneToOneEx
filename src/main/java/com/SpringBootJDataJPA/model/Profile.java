package com.SpringBootJDataJPA.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "profiletab")
public class Profile {
	@Id
	@Column(name = "prid")
	private Integer profId;
	@Column(name = "prcode")
	private String profCode;
	@Column(name = "prexp")
	private Double profExp;
	@Column(name = "prpack")
	private Double profPack;
}
