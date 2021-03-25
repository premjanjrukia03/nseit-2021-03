package com.nseindia.b2.authorservice.models;

import java.util.List;

import com.nseindia.b2.authorservice.entities.Author;

public class Request {
	
	 
	public String name;
	public List<String> books;
	
	public Author toAuthor() {
		Author author = new Author();
		author.setName(this.name);
		author.setBooks(this.books);
		return author;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		builder.append("Request [name=");
		builder.append(name);
		builder.append(", books=");
		builder.append(books);
		builder.append("]");
		return builder.toString();
	}
	
	
}
