package com.nseindia.b2.basicdi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
 * this will create a bean named message
 */

@Component
//@Scope("prototype")
public class Message {
	public String message;
	
	public void displayMessage() {
		System.out.println(message);
	}
	
//	@PostConstruct
	public void onInit() {
		System.out.println("Message object Created");
	}
	
//	@PreDestroy
	public void onDestroy() {
		System.out.println("Message object to be Destroyed");
	}
}
