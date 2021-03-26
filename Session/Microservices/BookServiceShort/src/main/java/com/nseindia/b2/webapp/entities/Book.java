package com.nseindia.b2.webapp.entities;

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
public class Book {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
	@ElementCollection(fetch = FetchType.EAGER)
	private Set<Long> authorIds;
	
	@Transient
	private Set<String> authors;
	
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
	
	
	
	public Set<Long> getAuthorIds() {
		return authorIds;
	}
	public void setAuthorIds(Set<Long> authorIds) {
		this.authorIds = authorIds;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", authorIds=");
		builder.append(authorIds);
		builder.append("]");
		return builder.toString();
	}
}
