package com.nseindia.b2.webapp.models;

import java.util.Set;

public class Book {
	private String name;
	private Set<Long> authorIds;

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
	
	
}
