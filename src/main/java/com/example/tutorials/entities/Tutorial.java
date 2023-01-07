package com.example.tutorials.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Tutorial")
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	private String name;
	@OneToMany(cascade = CascadeType.MERGE ,fetch = FetchType.EAGER, mappedBy = "tutorial")
	
	private Set<Comment> cooment = new HashSet<>();

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

	public Set<Comment> getCooment() {
		return cooment;
	}

	public void setCooment(Set<Comment> cooment) {
		this.cooment = cooment;
	}

	public Tutorial(int id, String name, Set<Comment> cooment) {
		super();
		this.id = id;
		this.name = name;
		this.cooment = cooment;
	}

	public Tutorial() {
		super();
		
	}

}
