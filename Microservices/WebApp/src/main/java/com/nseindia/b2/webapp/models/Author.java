package com.nseindia.b2.webapp.models;

import java.util.List;

public class Author {
	public Long id;
	public String name;
	public Integer bookCount;
	public List<String> books;
	
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
	public Integer getBookCount() {
		return bookCount;
	}
	public void setBookCount(Integer bookCount) {
		this.bookCount = bookCount;
	}
	public List<String> getBooks() {
		return books;
	}
	public void setBooks(List<String> books) {
		this.books = books;
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
	
	
}
