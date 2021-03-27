package com.nseindia.b2.authorsapi.services;

import java.util.List;

import com.nseindia.b2.authorsapi.entities.Author;

public interface AuthorService {
	
	// This method should add a new author to existing data of authors
	public Author add(Author author);
	
	// This method should return all the authors listed in existing data
	public List<Author> readAll();
	
	// Find and return a single Author object from the stored list of authors
	public Author read(Long id);
	
	// Finds and delete an Author data from the stored data and returns it
	// If no record is found then returns null.
	public Author delete(Long id);
	
	// Finds and updates the data of an author
	public Author update(Long id, Author author);
	
}
