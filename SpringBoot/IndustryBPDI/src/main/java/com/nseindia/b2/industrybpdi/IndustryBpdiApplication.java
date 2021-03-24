package com.nseindia.b2.industrybpdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nseindia.b2.industrybpdi.controllers.MessageController;

@SpringBootApplication
public class IndustryBpdiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(IndustryBpdiApplication.class, args);
		MessageController mc = (MessageController) ctx.getBean("messageController");
		mc.run();
	}
}
