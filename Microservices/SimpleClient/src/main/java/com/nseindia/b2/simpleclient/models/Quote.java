package com.nseindia.b2.simpleclient.models;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Quote {
	@JsonAlias({"type"})
	public String message;

	public Value value;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Quote [message=");
		builder.append(message);
		builder.append(", value=");
		builder.append(value);
		builder.append("]");
		return builder.toString();
	}
	
	
}
