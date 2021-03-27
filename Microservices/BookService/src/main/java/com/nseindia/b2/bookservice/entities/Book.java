package com.nseindia.b2.bookservice.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Book {
	@Id
	@GeneratedValue
	private Long id;

	private String title;

	@ElementCollection(fetch = FetchType.EAGER)
	private Set<String> Editions;
	
	private String isbn;

	
//	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Kolkata")
	@JsonFormat(pattern = "dd-MM-yyyy",timezone = "Asia/Kolkata")
	@Temporal(TemporalType.DATE)
	private Date publishDate;

	@ElementCollection(fetch = FetchType.EAGER)
	private Set<String> Authors;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<String> getEditions() {
		return Editions;
	}

	public void setEditions(Set<String> editions) {
		Editions = editions;
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
	
	

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [id=");
		builder.append(id);
		builder.append(", title=");
		builder.append(title);
		builder.append(", Editions=");
		builder.append(Editions);
		builder.append(", isbn=");
		builder.append(isbn);
		builder.append(", publishDate=");
		builder.append(publishDate);
		builder.append(", Authors=");
		builder.append(Authors);
		builder.append("]");
		return builder.toString();
	}

}
