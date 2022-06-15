package com.john.api.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.john.api.models.Book;
import com.john.api.services.BookService;

@Controller
public class ViewController {
	
	private final BookService bookService;
//	CONSTRUCTOR
	public ViewController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@RequestMapping("/")
	public String allBooks(Model model) {
		List<Book> allDaBooks = bookService.allBooks();
		
		model.addAttribute("allDaBooks", allDaBooks);
		return "allBooks.jsp";
	}

}
