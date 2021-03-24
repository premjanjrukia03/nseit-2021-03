package com.nseindia.b2.h2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nseindia.b2.h2.Controllers.BaseController;

@SpringBootApplication
public class Jpah2Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Jpah2Application.class, args);
		
		BaseController bc = (BaseController) ctx.getBean("baseController");
		bc.run();
	}

}
