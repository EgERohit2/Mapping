package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Courses;
import com.example.demo.services.serviceImplementation.CoursesServicesImplementation;

@RestController
@RequestMapping("/courses")
public class CoursesController {

	@Autowired
	private CoursesServicesImplementation coursesServicesImplementation;
	
	@GetMapping
	public List<Courses> getAll(){
		return coursesServicesImplementation.getAll();
	}
	
	@PostMapping
	public Courses postAllData(@RequestBody Courses courses) {
		return coursesServicesImplementation.postAll(courses);
	}
	
	@PutMapping("/{id}")
	public void updateAllData(@RequestBody Courses courses, @PathVariable int id) {
		this.coursesServicesImplementation.updateAll(courses, id);
	}
}
