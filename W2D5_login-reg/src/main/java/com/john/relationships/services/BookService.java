package com.john.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.john.relationships.models.Book;
import com.john.relationships.repos.BookRepo;

@Service
public class BookService {
	
//	CRUD
	@Autowired
	private BookRepo bookRepo;

//	READ ALL
	public List<Book> allBooks() {
		return bookRepo.findAll();
	}
	
//	CREATE 
	public Book createBook(Book b) {
//		b.setAuthor(null);
		return bookRepo.save(b);
	}
	
//	READ ONE
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepo.findById(id);
		if (optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
//		ternary:
//		return optionalBook.isPresent() ? optionalBook.get() : null;
	}
	
//	UPDATE
	public Book updateBook(Book b) {
		return bookRepo.save(b);
	}

	
//	DELETE
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
	}

}
