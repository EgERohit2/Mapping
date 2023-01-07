package com.example.tutorials.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tutorials.entities.Comment;
import com.example.tutorials.serviceImplementation.CommentServiceImplementation;

@RestController
@RequestMapping("/comment")
public class CommentController {

	@Autowired
	private CommentServiceImplementation commentServiceImplementation;

	@GetMapping()
	public List<Comment> getAllData() {
		return commentServiceImplementation.getAll();
	}
	
	@PostMapping()
	public Comment postAllData(@RequestBody Comment comment) {
		return commentServiceImplementation.postAll(comment);
	}
}
