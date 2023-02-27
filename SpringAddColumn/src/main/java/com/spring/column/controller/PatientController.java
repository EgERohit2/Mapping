package com.spring.column.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.column.entities.Patient;
import com.spring.column.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	private PatientService patientService;

	@GetMapping()
	public List<Patient> getAllData() {
		return this.patientService.getAll();
	}

	@PostMapping()
	public String postAllData(@RequestBody Patient patient) {
		this.patientService.postData(patient);
		return "data posted successfully";
	}

	@PutMapping("/{id}")
	public String updateAllData(@RequestBody Patient patient, @PathVariable int id) {
		this.patientService.updateData(patient, id);
		return "Data updated successfully";
	}

	@DeleteMapping("/{id}")
	public String deleteAllData(@PathVariable int id) {
		this.patientService.deleteData(id);
		return "data deleted successfully";
	}
}
