package com.nseindia.b2.authorservice.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.nseindia.b2.authorservice.entities.Author;


@JsonInclude(Include.NON_NULL)
public class Response {
	public String message;
	public Author author;
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
}
