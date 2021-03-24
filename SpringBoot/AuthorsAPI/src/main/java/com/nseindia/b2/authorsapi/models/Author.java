package com.nseindia.b2.authorsapi.models;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class Author {
	private Long id;
	private String name;
	private String genre;
	private Set<String> books;
	
	public Author() {
		this.books= new HashSet<String>();
	}
	
	public Author(Long id, String name, String genre, Set<String> books) {
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.books = books;
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
	
	public void addBook(String book) {
		this.books.add(book);
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", genre=" + genre + ", books=" + books + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(books, genre, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		return Objects.equals(books, other.books) && Objects.equals(genre, other.genre) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name);
	}
	
}
