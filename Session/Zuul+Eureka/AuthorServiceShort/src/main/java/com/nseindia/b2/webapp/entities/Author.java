package com.nseindia.b2.webapp.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@JsonInclude(Include.NON_NULL)
public class Author {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
	@ElementCollection(fetch = FetchType.EAGER)
	private Set<Long> bookIds;
	
	@Transient
	private Set<String> books;
	
	
	
	
	public Author() {
		this.bookIds = new HashSet<Long>();
		this.books = new HashSet<String>();
	}
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
	public Set<Long> getBookIds() {
		return bookIds;
	}
	public void setBookIds(Set<Long> bookIds) {
		this.bookIds = bookIds;
	}
	
	
	
	public Set<String> getBooks() {
		return books;
	}
	public void setBooks(Set<String> books) {
		this.books = books;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Author [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", bookIds=");
		builder.append(bookIds);
		builder.append(", books=");
		builder.append(books);
		builder.append("]");
		return builder.toString();
	}
}
