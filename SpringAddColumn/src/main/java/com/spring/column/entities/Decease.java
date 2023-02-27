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
@Table(name = "decese_table")
public class Decease {

	public Decease() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Decease(int id, String name, String symptoms, Set<AddColumn> addColumn) {
		super();
		this.id = id;
		this.name = name;
		this.symptoms = symptoms;
		this.addColumn = addColumn;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String symptoms;
	@OneToMany(mappedBy = "decease",cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
	private Set<AddColumn> addColumn;

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

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public Set<AddColumn> getAddColumn() {
		return addColumn;
	}

	public void setAddColumn(Set<AddColumn> addColumn) {
		this.addColumn = addColumn;
	}

	@Override
	public String toString() {
		return "Decease [id=" + id + ", name=" + name + ", symptoms=" + symptoms + ", addColumn=" + addColumn + "]";
	}

}
