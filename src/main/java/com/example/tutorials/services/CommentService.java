package com.example.tutorials.services;

import java.util.List;

import com.example.tutorials.entities.Comment;

public interface CommentService {

	public List<Comment> getAll();
	
	public Comment postAll(Comment comment);
}
