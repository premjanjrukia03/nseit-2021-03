package com.nseindia.b2.authorsapi.models;

import java.util.Set;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.nseindia.b2.authorsapi.entities.Author;

@Component
@JsonInclude(Include.NON_NULL)
public class ResponseAuthor {
	private String message;
	private Long id;
	private String name;
	private String genre;
	private Set<String> books;
	
	public ResponseAuthor() {
		
	}
	
	public ResponseAuthor(Author author) {
		this.setId(author.getId());
		this.setBooks(author.getBooks());
		this.setName(author.getName());
		this.setGenre(author.getGenre());
	}
	
	public ResponseAuthor(String message) {
		this.setMessage(message);
	}
	
	public ResponseAuthor(Author author, String message) {
		this.setId(author.getId());
		this.setBooks(author.getBooks());
		this.setName(author.getName());
		this.setGenre(author.getGenre());
		this.setMessage(message);
	}
	
	
	public String getGenre() {
		return genre;
	}



	public void setGenre(String genre) {
		this.genre = genre;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getBooks() {
		return books;
	}
	public void setBooks(Set<String> books) {
		this.books = books;
	}
}
