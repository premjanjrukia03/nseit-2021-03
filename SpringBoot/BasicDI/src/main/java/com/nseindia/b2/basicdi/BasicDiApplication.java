package com.nseindia.b2.basicdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/*
 * This is a badly written code
 * but a good example on how not to write code.
 */
@SpringBootApplication
public class BasicDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BasicDiApplication.class, args);

//		Example for DI of a class which doesn't have setters as well as constructors
//		tryDIProperties(ctx);

//		Example for DI of a class which has setters
//		tryDISetters(ctx);
		
		
// Example for DI of a class with constuctors
		tryDIContructors(ctx);

	}

	private static void tryDIContructors(ApplicationContext ctx) {
		
		// MessageC m = new MessageC("Hello World");
		// m.displayMessage();

		MessageC m = (MessageC) ctx.getBean("messageC");
		m.displayMessage();
	}

	private static void tryDISetters(ApplicationContext ctx) {
		// MessageS m = new MessageS();
		// m.setMessage("Hello World");
		// m.displayMessage();
		MessageS m = (MessageS) ctx.getBean("messageS");
		m.displayMessage();
		m.setMessage("Hello World");
		m.displayMessage();
	}

	private static void tryDIProperties(ApplicationContext ctx) {
		// Message m = new Message();
		// m.message = "Hello World";
		// m.displayMessage();
		// This object will be created at the start of the code
		// Java and Spring IoC will not wait to encounter an object constructor.
		Message m = (Message) ctx.getBean("message");
		Message m1 = (Message) ctx.getBean("message");
		m.displayMessage();
		m1.displayMessage();
		m.message = "Hello World";
		m.displayMessage();
		m1.displayMessage();
		// change the scope of Message to prototype and see the difference
	}

}
