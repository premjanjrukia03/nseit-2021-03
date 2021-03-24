package com.nseindia.b2.authorsapi.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


// Data inside a db is not modified by making changes to Author objects
// You will have to use Repositories for DML
// The Annotations here only help the DDL to create and setup tables
@Entity
@Table(name = "authors")
public class Author implements Comparable<Author>{
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(length = 20,nullable = false)
	private String name;
	private String genre;
	
	// Easy way, but I would not recommend using it normally
	// It's very good when we have db relationships
	// Creating Request and Response Models is always a better refactorable option
	// @JsonIgnore
	@ElementCollection(fetch = FetchType.EAGER) 
	private Set<String> books;
	
	
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
