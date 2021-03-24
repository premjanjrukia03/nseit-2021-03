package com.nseindia.b2.vehicle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		String vType ="car";
		
//		if (false) {
//			vType="car";
//			// v = new Car();
//		} else {
//			vType="bike";
//			// v = new Bike();
//		}
		
		Car v = (Car) context.getBean(vType);
//		Vehicle v = new Car();
		
//		v.start();
//		v.stop();
		
//		v.setBrand("BMW");
//		v.printBrand();
//		
//		v1.printBrand();

		v.printBrand();
		v.printHighlights();
		
		
	}
}
