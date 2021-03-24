package com.nseindia.b2.vehicle;

import java.util.ArrayList;
import java.util.List;

public class Car implements Vehicle{
	private String brand;
	private List<String> highlights = new ArrayList<String>();
	
	
	
	/*
	 * methods related to highlights
	 */
	public List<String> getHighlights() {
		return highlights;
	}

	public void setHighlights(List<String> highlights) {
		this.highlights = highlights;
	}
	
	public void printHighlights() {
		System.out.println(highlights);
	}

	
	/*
	 * Car methods
	 */
	
	public void start() {
		System.out.println("The car has started");
	}

	public void stop() {
		System.out.println("The car has stopped");
	}

	public void printBrand() {
		System.out.println("This car is of the brand " + brand);
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public Car(String brand) {
		System.out.println("inside the constructor of car");
		this.brand = brand;
	}
	
	public Car() {
		
	}
	
	public void oninit() {
		System.out.println("Oninit method of car with " + brand + " executed");
	}
}
