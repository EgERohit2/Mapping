package com.example.tutorials.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tutorials.entities.Comment;
import com.example.tutorials.repository.CommentRepository;
import com.example.tutorials.services.CommentService;

@Service
public class CommentServiceImplementation implements CommentService{

	@Autowired
	private CommentRepository commentRepository;
	
	@Override
	public List<Comment> getAll() {
		return commentRepository.findAll();
	}

	@Override
	public Comment postAll(Comment comment) {
		Comment c = new Comment();
		c.setName(comment.getName());
		c.setRemark(comment.getRemark());
		c.setTutorial(comment.getTutorial());
		return commentRepository.save(c);	
	}

	

	
	
	
}
