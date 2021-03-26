package com.nseindia.b2.authorservice.services;

import java.util.List;

import com.nseindia.b2.authorservice.entities.Author;

public interface AuthorService {

		public List<Author> readAll();
		/*
		 * It returns an author object if something is found with the id
		 * returns null if nothing is found
		 */
		public Author read(Long id);
		
		public Author add(Author author);
		
		public Author update(Long id, Author author);
		
		public Author delete(Long id);
}
