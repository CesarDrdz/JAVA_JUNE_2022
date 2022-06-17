package com.john.relationships.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.john.relationships.models.Library;

@Repository
public interface LibraryRepo extends CrudRepository<Library, Long> {
	
	List<Library> findAll();
}
