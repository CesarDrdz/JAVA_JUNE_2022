package com.john.full_crud.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.john.full_crud.models.Book;
import com.john.full_crud.services.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookServ;
	
//	just a redirect
	@GetMapping("/")
	public String index() {
		return "redirect:/books";
	}
	
//	SHOW ALL THE BOOKS RENDER
	@GetMapping("/books")
	public String allBooks(Model x) {
//		show all the books
		List<Book> allDaBooks = bookServ.allBooks();
		x.addAttribute("allDaBooks", allDaBooks);
		return "index.jsp";
	}
	
	
//	SHOW ONE RENDER
//	localhost:8080/books/3
	@GetMapping("/books/{id}")
	public String showOne(@PathVariable("id") Long id, Model model) {
		Book oneBook = bookServ.findBook(id);
//		System.out.println(oneBook.getTitle());
		model.addAttribute("oneBook", oneBook);
		return "show.jsp";
	}
	
//	@GetMapping("/books/new")
//	public String createBookPage(Model model) {
//		Book newBook = new Book();
//		model.addAttribute("newBook", newBook);
//		return "new.jsp";
//	}
	
//	SHOW THE CREATE page and pass in an empty book obj
	@GetMapping("/books/new")
	public String createBookPage(
			@ModelAttribute("book") Book book, Model model) {
		model.addAttribute("x", 100);
		return "new.jsp";
	}
	
//	POST to this route and accept the obj - validate it and,
//	either re-render with errors or redirect
	@PostMapping("/books")
	public String createBook(@Valid @ModelAttribute("book") Book book, 
			BindingResult result, Model model) {
		
//		check the book
		 if (result.hasErrors()) {
				model.addAttribute("x", 100);
	            return "new.jsp";
	        } else {
//	        	if it passes then SAVE it to the DB
	            bookServ.createBook(book);
	            return "redirect:/books";
	        }
	}
	
	
	
	
	
	
	
	
	

}
