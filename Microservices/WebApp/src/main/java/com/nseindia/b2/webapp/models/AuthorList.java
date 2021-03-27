package com.nseindia.b2.webapp.models;

import java.util.List;

public class AuthorList {
	private String message;
	private List<Author> authors;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AuthorList [message=");
		builder.append(message);
		builder.append(", authors=");
		builder.append(authors);
		builder.append("]");
		return builder.toString();
	}
	
	
}
