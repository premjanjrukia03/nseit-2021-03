package com.nseindia.b2.bookservice.models;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.nseindia.b2.bookservice.entities.Book;

public class Request {
	
	 
	public String title;
	public Set<String> editions;
	
	// mm is for minutes, MM is for months
//	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Kolkata")
	@JsonFormat(pattern = "dd-MM-yyyy",timezone = "Asia/Kolkata")
	public Date publishDate;
	
	public Set<String> Authors;

	
	public Book toBook() {
		Book book = new Book();
		book.setId(null);
		book.setTitle(title);
		book.setPublishDate(publishDate);
		book.setEditions(editions);
		book.setAuthors(Authors);
		return book;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Set<String> getEditions() {
		return editions;
	}


	public void setEditions(Set<String> editions) {
		this.editions = editions;
	}



	

	public Date getPublishDate() {
		return publishDate;
	}


	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}


	public Set<String> getAuthors() {
		return Authors;
	}


	public void setAuthors(Set<String> authors) {
		Authors = authors;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Request [title=");
		builder.append(title);
		builder.append(", editions=");
		builder.append(editions);
		builder.append(", publishDate=");
		builder.append(publishDate);
		builder.append(", Authors=");
		builder.append(Authors);
		builder.append("]");
		return builder.toString();
	}


	
}
