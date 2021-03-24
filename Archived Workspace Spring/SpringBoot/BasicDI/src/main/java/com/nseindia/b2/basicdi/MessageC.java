package com.nseindia.b2.basicdi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
 * This thing is similar to Message class
 * but it has a constructor
 */
@Component
public class MessageC {
	public String message;

	public void displayMessage() {
		System.out.println(message);
	}

	public MessageC(String message) {
		this.message = message;
	}

	// Need to have a default constructor if trying to use as a bean directly
	// Can you use other constructors using a Factory
	public MessageC() {
		this.message = "Test Message";
	}
}
