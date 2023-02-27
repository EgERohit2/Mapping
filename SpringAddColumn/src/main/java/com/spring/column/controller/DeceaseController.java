package com.spring.column.controller;

import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.column.entities.Decease;
import com.spring.column.service.DeceaseService;

@RestController
@RequestMapping("decease")
public class DeceaseController {

	@Autowired
	private DeceaseService deceaseService;
	
	@GetMapping()
	public List<Decease> getAllData(){
		return this.deceaseService.getAll();
	}
	
	@PostMapping()
	public String postAllData(@RequestBody Decease decease) {
		this.deceaseService.postData(decease);
		return "data posted successfully";
	}
	
	@PutMapping("/{id}")
	public String updateAllData(@RequestBody Decease decease, @PathVariable int id) {
		this.deceaseService.updateData(decease, id);
		return "data update successfully";
	}
	
	@DeleteMapping("/{id}")
	public String deleteAllData(@PathVariable int id) {
		this.deceaseService.deleteData(id);
		return "data deleted successfully";
		
	}
	
	@GetMapping("/pagination")
	public void getAllPaginationData(@RequestParam(value = "pageNumber") int pageNumber,
			@RequestParam(value = "pageSize") int pageSize ) {
		this.deceaseService.getAllPagination(pageNumber, pageSize);
	}
}
