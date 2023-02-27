package com.spring.column.service;

import java.util.List;

import com.spring.column.entities.Patient;

public interface PatientService {

	List<Patient> getAll();
	
	public Patient postData(Patient patient);
	
	public void updateData(Patient patient,int id);
	
	public void deleteData(int id);
}
