package com.john.full_crud.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.john.full_crud.models.Book;

@Repository
public interface BookRepo extends CrudRepository<Book, Long> {

	List<Book> findAll();
}
