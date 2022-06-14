package com.john.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.john.api.models.Book;
import com.john.api.repo.BookRepository;

@Service
public class BookService {
	// adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    
    // READ ALL
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    
    // CREATE
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    
    // READ ONE
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
}
