package com.spring.column.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.column.entities.Patient;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer>{

}
