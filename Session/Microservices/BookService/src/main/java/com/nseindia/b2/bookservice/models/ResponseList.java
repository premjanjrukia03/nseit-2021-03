package com.nseindia.b2.bookservice.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.nseindia.b2.bookservice.entities.Book;

@JsonInclude(Include.NON_NULL)
public class ResponseList {
	public String message;
	public List<Book> books;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ResponseList [message=");
		builder.append(message);
		builder.append(", books=");
		builder.append(books);
		builder.append("]");
		return builder.toString();
	}

	
}
