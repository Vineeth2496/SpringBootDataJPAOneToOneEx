package com.SpringBootJDataJPA.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "emptab")
public class Employee {
	@Id
	@Column(name = "eid")
	private Integer empId;
	@Column(name = "ename")
	private String empName;
	@Column(name = "edesg")
	private String empDesg;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pidFK", unique = true) // No duplicates
	//@JoinColumn(name = "pidFK", unique = true, nullable = false) // No duplicates
	private Profile pob;	//HAS-A
}
