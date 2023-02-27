package com.spring.column.entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "patient_table")
public class Patient {

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(int id, String name, String email, Set<AddColumn> addColumns) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.addColumns = addColumns;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	@OneToMany(mappedBy = "patient",cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
	private Set<AddColumn> addColumns;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<AddColumn> getAddColumns() {
		return addColumns;
	}

	public void setAddColumns(Set<AddColumn> addColumns) {
		this.addColumns = addColumns;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", email=" + email + ", addColumns=" + addColumns + "]";
	}

}
