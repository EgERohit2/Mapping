package com.spring.column.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.column.entities.AddColumn;
import com.spring.column.service.AddColumnService;

@RestController
public class AddColumnController {

	@Autowired
	private AddColumnService addColumnService;
	
	@GetMapping("/column")
	public List<AddColumn> getAllDataColumn(){
		return addColumnService.getAllColumn();
	}
	
	@PostMapping("postColumn")
	public void getAllDataColumn(@RequestBody AddColumn addColumn) {
		this.addColumnService.postAllColumn(addColumn);
	}
}
