package com.nseindia.b2.vehicle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Factory.class);
		Car c = (Car) context.getBean(Car.class);
		Car c1 = (Car) context.getBean(Car.class);
		
		c.setBrand("Porche");
		c.printBrand();
		c1.printBrand();
	}

}
