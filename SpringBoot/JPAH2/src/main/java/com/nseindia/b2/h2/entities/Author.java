package com.nseindia.b2.h2.entities;

import javax.persistence.Entity;
import javax.persistence.Id;


// This creates a table with the same name as the class, just the name is all uppercase
@Entity
public class Author {
	@Id
	private Long id;
	private String name;
	private String category;
//	private Set<Book> books;
//	SQL doesn't support complex data structure
//	This would actually work on a NoSQL db like MongoDB
	
	public Author() {
		
	}
	
	
	
	public Author(Long id, String name, String category) {
		this.id = id;
		this.name = name;
		this.category = category;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}



	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", category=" + category + "]";
	}
	
	
}
