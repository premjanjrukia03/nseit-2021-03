package com.nseindia.b2.webapp.models;

public class PostResponseAuthor {
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
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PostResponseAuthor [message=");
		builder.append(message);
		builder.append(", author=");
		builder.append(author);
		builder.append("]");
		return builder.toString();
	}
	
	
}
