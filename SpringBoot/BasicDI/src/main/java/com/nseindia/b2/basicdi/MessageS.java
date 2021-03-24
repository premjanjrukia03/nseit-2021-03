package com.nseindia.b2.basicdi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
 
/*
 * This is similar to the message class but now it has getters and setters
 */
@Component
public class MessageS {
	public String message;

	public void displayMessage() {
		System.out.println(message);
	}

	public String getMessage() {
		return message;
	}

	@Value("This is a default message set by @Value")
	public void setMessage(String message) {
		this.message = message;
	}
	
}
