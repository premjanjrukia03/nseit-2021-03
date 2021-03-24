package com.nseindia.b2.webapp.models;

public class PostAuthorResponse {
	private String message;

	public String getMessage() {
		return message;
	}

	
	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public String toString() {
		return "PostAuthorResponse [message=" + message + "]";
	}
	
	
}
