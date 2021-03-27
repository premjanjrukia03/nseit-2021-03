package com.nseindia.b2.bookservice.services;

import java.util.List;

import com.nseindia.b2.bookservice.entities.Book;

public interface BookService {

		public List<Book> readAll();
		/*
		 * It returns an author object if something is found with the id
		 * returns null if nothing is found
		 */
		public Book read(Long id);
		
		public Book add(Book book);
		
		public Book update(Long id, Book book);
		
		public Book delete(Long id);
}
