package com.example.demo.services.serviceImplementation;

import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.services.StudentServices;

@Service
public class StudentServiceImplementation implements StudentServices{

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAll() {
		return studentRepository.findAll();
	}

	@Override
	public Student postAll(Student student) {	
		return studentRepository.save(student);
	}

	@Override
	public List<Student> findStudentsContiningByName(String name) {
		return studentRepository.findStudentsContiningByName(name);
	}

	@Override
	public void updateAll(Student student, int id) {
		Student s = studentRepository.findById(id).orElseThrow();
		s.setName(student.getName());
		s.setAge(student.getAge());
		s.setCourses(new HashSet<>(student.getCourses()) );
		
	    studentRepository.save(s);
	}
	
	
	
}
