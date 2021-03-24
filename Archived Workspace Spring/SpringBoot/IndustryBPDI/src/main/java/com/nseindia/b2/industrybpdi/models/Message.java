package com.nseindia.b2.industrybpdi.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Message {
	private String message="Empty Message";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String toUpperCase() {
		return message.toUpperCase();
	}
}
