package com.nseindia.b2.bestbasicdi;

/*
 * This class has a single responsibility of Managing Data related to a Message
 * It should only have methods around operations related to String
 * Methods related to I/O from outside the code should not be present for this particular case
 */

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
