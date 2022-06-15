package com.john.full_crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.john.full_crud.models.Book;
import com.john.full_crud.repos.BookRepo;

@Service
public class BookService {

	@Autowired
	private BookRepo bookRepo;
	
//	READ ALL
	public List<Book> allBooks(){
		return bookRepo.findAll();
	}
	
//	CREATE
	public Book createBook(Book b) {
		return bookRepo.save(b);
	}
	
//	READ ONE
	public Book findBook(Long id) {
		
		
		Optional<Book> optionalBook = bookRepo.findById(id);
		
//		return optionalBook.isPresent() ? optionalBook.get() : null;
				
		if (optionalBook.isPresent()) {
			return optionalBook.get();
		} else {		
			return null;
		}
	}
}
