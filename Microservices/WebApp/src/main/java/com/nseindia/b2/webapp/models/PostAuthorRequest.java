package com.nseindia.b2.webapp.models;

public class PostAuthorRequest {
	private String name;
	private String genre;
	
	public PostAuthorRequest() {
		
	}
	
	public PostAuthorRequest(String name, String genre) {

		this.name = name;
		this.genre = genre;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	
}
