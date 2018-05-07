package com.juliospa.apps.guru.app1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juliospa.apps.guru.app1.repositories.AuthorRepository;

@Controller
public class AuthorController {

	private AuthorRepository authorRepository;

	public AuthorController(AuthorRepository authorRepository) {
		super();
		this.authorRepository = authorRepository;
	}

	@RequestMapping("/authors") // goes to the app path books 
	public String getAuthors(Model model) {
		model.addAttribute("authors",authorRepository.findAll()); // put in books variable the find all result
		return "authors"; // redirects to view books
	}
	
}
