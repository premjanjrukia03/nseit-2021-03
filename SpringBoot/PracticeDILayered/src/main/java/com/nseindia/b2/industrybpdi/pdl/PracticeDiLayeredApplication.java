package com.nseindia.b2.industrybpdi.pdl;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nseindia.b2.industrybpdi.pdl.controllers.MenuController;

@SpringBootApplication
public class PracticeDiLayeredApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(PracticeDiLayeredApplication.class, args); 
		MenuController mc = (MenuController) ctx.getBean("menuController");	
		
		mc.run();
	}

	@Bean
	public Scanner createScanner() {
		Scanner in = new Scanner(System.in);
		return in;
	}
}
