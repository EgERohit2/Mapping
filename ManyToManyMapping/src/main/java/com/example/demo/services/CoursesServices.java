package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Courses;

public interface CoursesServices {

	public List<Courses> getAll();
	
	public Courses postAll(Courses courses);
	
	public void updateAll(Courses course,int id);
	
	
}
