package com.nseindia.b2.bestbasicdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BestBasicDiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BestBasicDiApplication.class, args);
		
		MessageIO m = new MessageIOTerm();
		
		m.readMessage();
		m.createMessage();
		m.readMessage();
	}

}
