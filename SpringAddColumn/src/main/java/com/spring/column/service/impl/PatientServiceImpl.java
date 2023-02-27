package com.spring.column.service.impl;

import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.column.entities.Patient;
import com.spring.column.repository.PatientRepository;
import com.spring.column.service.PatientService;
@Service
public class PatientServiceImpl implements PatientService{

	@Autowired
	private PatientRepository patientRepository;
	
	@Override
	public List<Patient> getAll() {
		// TODO Auto-generated method stub
		return  patientRepository.findAll();
	}

	@Override
	public Patient postData(Patient patient) {
		// TODO Auto-generated method stub
		Patient patient2 = new Patient();
		patient2.setName(patient.getName());
		patient2.setEmail(patient.getEmail());
		//patient2.setAddColumns(new HashSet<>(patient.getAddColumns()));
		return this.patientRepository.save(patient2);
	}

	@Override
	public void updateData(Patient patient, int id) {
		// TODO Auto-generated method stub
		Patient p = patientRepository.findById(id).orElseThrow();
		p.setName(patient.getName());
		p.setEmail(patient.getEmail());
	    this.patientRepository.save(p);
		
	}

	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		 this.patientRepository.deleteById(id);
		
	}
	
	

}
