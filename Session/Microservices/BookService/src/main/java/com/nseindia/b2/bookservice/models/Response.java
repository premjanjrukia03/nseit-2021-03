package com.nseindia.b2.bookservice.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.nseindia.b2.bookservice.entities.Book;


@JsonInclude(Include.NON_NULL)
public class Response {
	public String message;
	public Book book;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Response [message=");
		builder.append(message);
		builder.append(", book=");
		builder.append(book);
		builder.append("]");
		return builder.toString();
	}
	
	
}
