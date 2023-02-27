package com.spring.column.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.column.entities.AddColumn;
import com.spring.column.repository.AddColumnRepositiory;
import com.spring.column.service.AddColumnService;
@Service
public class AddColumnServiceImpl implements AddColumnService{

	@Autowired
	private AddColumnRepositiory addColumnRepositiory;
	
	@Override
	public List<AddColumn> getAllColumn() {
		// TODO Auto-generated method stub
		return addColumnRepositiory.findAll();
	}

	@Override
	public AddColumn postAllColumn(AddColumn addColumn) {
		// TODO Auto-generated method stub
		return addColumnRepositiory.save(addColumn);
	}

	
}
