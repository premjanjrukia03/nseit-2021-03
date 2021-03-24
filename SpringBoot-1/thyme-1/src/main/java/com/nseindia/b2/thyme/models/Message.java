package com.nseindia.b2.thyme.models;

import org.springframework.stereotype.Component;

@Component
public class Message {
	private String msg="Msg from Message";

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String test() {
		return "Test String";
	}

	@Override
	public String toString() {
		return "From toString() with string:" + msg;
	}
	
}
