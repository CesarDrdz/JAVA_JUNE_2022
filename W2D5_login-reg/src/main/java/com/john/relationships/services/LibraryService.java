package com.john.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.john.relationships.models.Library;
import com.john.relationships.repos.LibraryRepo;

@Service
public class LibraryService {
//	CRUD
	@Autowired
	private LibraryRepo libRepo;
	
//	READ ALL
	public List<Library> allLibraries() {
		return libRepo.findAll();
	}
	
//	CREATE 
	public Library createLibrary(Library l) {
		return libRepo.save(l);
	}
	
//	READ ONE
	public Library findLibrary(Long id) {
		Optional<Library> optionalBook = libRepo.findById(id);
		if (optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}
	
//	UPDATE
	public Library updateLibrary(Library l) {
		return libRepo.save(l);
	}
	
//	DELETE
	public void deleteLibrary(Long id) {
		libRepo.deleteById(id);
	}
	

}
