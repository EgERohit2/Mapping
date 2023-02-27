package com.spring.column.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.column.entities.Decease;
@Repository
public interface DeceaseRepository extends JpaRepository<Decease, Integer>{

	

}
