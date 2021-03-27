package com.nseindia.b2.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BookServiceShortApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookServiceShortApplication.class, args);
	}

}
