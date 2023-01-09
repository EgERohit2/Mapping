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

import com.example.demo.entities.Student;
import com.example.demo.services.serviceImplementation.StudentServiceImplementation;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentServiceImplementation studentServiceImplementation;
	
	@GetMapping()
	public List<Student> getAllData(){
		return studentServiceImplementation.getAll();
	}

	@PostMapping()
	public Student postAllData(@RequestBody Student student) {
		return studentServiceImplementation.postAll(student);
	}
	
	@GetMapping("/{name}")
	public List<Student> findAllByName(@PathVariable String name){
		return studentServiceImplementation.findStudentsContiningByName(name);
	}
	
	@PutMapping("/{id}")
	public void updateAllData(@RequestBody Student student,@PathVariable int id) {
		 this.studentServiceImplementation.updateAll(student,id);
		 
	}
	
}
