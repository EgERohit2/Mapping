package com.spring.column.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.column.entities.AddColumn;
@Repository
public interface AddColumnRepositiory extends JpaRepository<AddColumn, Integer>{

}
