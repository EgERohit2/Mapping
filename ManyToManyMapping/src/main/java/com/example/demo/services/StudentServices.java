package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Student;

public interface StudentServices {

	public List<Student> getAll();
	
	public Student postAll(Student student);
	
	public List<Student> findStudentsContiningByName(String name);
	
	public void updateAll( Student student,int id);
}
