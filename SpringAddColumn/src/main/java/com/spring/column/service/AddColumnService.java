package com.spring.column.service;

import java.util.List;

import com.spring.column.entities.AddColumn;

public interface AddColumnService {

	public List<AddColumn> getAllColumn();
	
	public AddColumn postAllColumn(AddColumn addColumn);
}
