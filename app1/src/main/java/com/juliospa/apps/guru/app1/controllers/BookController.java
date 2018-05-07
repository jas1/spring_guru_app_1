package com.juliospa.apps.guru.app1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juliospa.apps.guru.app1.repositories.BookRepository;

@Controller
public class BookController {

	private BookRepository bookRepository;

	public BookController(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	@RequestMapping("/books") // goes to the app path books 
	public String getBooks(Model model) {
		model.addAttribute("books",bookRepository.findAll()); // put in books variable the find all result
		return "books"; // redirects to view books
	}
	
}
