package com.nseindia.b2.authorsapi.models;

import java.util.HashSet;
import java.util.Set;

public class Author implements Comparable<Author>{
	private Long id;
	private String name;
	private String genre;
	private Set<String> books = new HashSet<String>();
	
	
	// ------------------------Constructors--------------------------
	
	public Author() {
		
	}
	
	public Author(Long id, String name, String genre, Set<String> books) {
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.books = books;
	}
	
	// -------------------------Getters and Setters---------------------

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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Set<String> getBooks() {
		return books;
	}

	public void setBooks(Set<String> books) {
		this.books = books;
	}

	// ------------------------------- toString-------------------------------

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", genre=" + genre + ", books=" + books + "]";
	}

	
	// -----------------------------Comparable------------------------------
	
	@Override
	public int compareTo(Author o) {
		// TODO Auto-generated method stub
		return (int) (this.id - o.id);
	}	
	
}
