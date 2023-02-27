package com.spring.column.service;

import java.util.List;

import com.spring.column.entities.Decease;

public interface DeceaseService {

	List<Decease> getAll();
	
	public Decease postData(Decease decease);
	
	public void updateData(Decease decease,int id);
	
	public void deleteData(int id);
	
	public Decease getById(int id);
	
	List<Decease> getAllPagination(int pageNumber,int pageSize);
	
}
