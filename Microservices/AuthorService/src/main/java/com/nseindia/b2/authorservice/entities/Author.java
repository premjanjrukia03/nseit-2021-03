package com.nseindia.b2.authorservice.entities;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Author {
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	// Should I store bookCount in the DB?
	// I can always recalculate it from books
	// The tradeoff is between runtime overheads vs
	// Size of db
	@Transient
	private Integer bookCount;
	
	@ElementCollection(fetch = FetchType.EAGER)
	private List<String> books;

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

	// -- Changes have been made
	public Integer getBookCount() {
		this.bookCount = books.size();
		return this.bookCount;
	}

	public List<String> getBooks() {
		return books;
	}

	public void setBooks(List<String> books) {
		this.books = books;
	}
	
	public void addBook(String book) {
		this.books.add(book);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Author [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", bookCount=");
		builder.append(bookCount);
		builder.append(", books=");
		builder.append(books);
		builder.append("]");
		return builder.toString();
	}

	public Author() {
		super();
	}

	public Author(String name, Integer bookCount, List<String> books) {
		super();
		this.name = name;
		this.bookCount = bookCount;
		this.books = books;
	}
	
	// TODO
	// Retrieve Book Publish date
	// Retrieve Book Latest Editions
	
	
}

