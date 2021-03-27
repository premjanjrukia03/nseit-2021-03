package com.nseindia.b2.authorservice.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.nseindia.b2.authorservice.entities.Author;

@JsonInclude(Include.NON_NULL)
public class ResponseList {
	public String message;
	public List<Author> authors;

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
		builder.append("ResponseList [message=");
		builder.append(message);
		builder.append(", author=");
		builder.append(authors);
		builder.append("]");
		return builder.toString();
	}

}
