package com.spring.column.entities;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "additional_column")
public class AddColumn {

	public AddColumn() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddColumn(int id, Patient patient, Decease decease) {
		super();
		this.id = id;
		this.patient = patient;
		this.decease = decease;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name = "patient_id")
	Patient patient;

	@ManyToOne
	@JoinColumn(name = "decease_id")
	Decease decease;

	@CreationTimestamp
	LocalDate createdAt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Decease getDecease() {
		return decease;
	}

	public void setDecease(Decease decease) {
		this.decease = decease;
	}

}
