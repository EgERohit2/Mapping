package com.example.demo.services.serviceImplementation;

import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Courses;
import com.example.demo.repository.CoursesRepository;
import com.example.demo.services.CoursesServices;
@Service
public class CoursesServicesImplementation implements CoursesServices{

	@Autowired
	private CoursesRepository coursesRepository;

	@Override
	public List<Courses> getAll() {
		return coursesRepository.findAll();
	}

	@Override
	public Courses postAll(Courses courses) {
		return coursesRepository.save(courses);
	}

	@Override
	public void updateAll(Courses course, int id) {
		Courses c = coursesRepository.findById(id).orElseThrow();
		c.setTitle(course.getTitle());
		c.setFee(course.getFee());
		c.setStudent(new HashSet<>(course.getStudent()));
		coursesRepository.save(c);
	}
}
