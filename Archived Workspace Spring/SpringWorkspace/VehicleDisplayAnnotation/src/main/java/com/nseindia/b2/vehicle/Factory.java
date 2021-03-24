package com.nseindia.b2.vehicle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Factory {
	
	@Bean
	@Scope("prototype")
	public Car createCar() {
		Car c = new Car();
		c.setBrand("no brand set");
		return c;
	}
	
	/*
	 * the above code is equivalent to
	 * 
	 * <bean  id="car" class="com.nseindia.b2.vehicle.Car">
		<property name="brand" value="no brand set"></property>
		</bean>
	 */
	
}
