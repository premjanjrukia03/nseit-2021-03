package com.nseindia.control;

/*
 * This project will contain examples and notes related to
 * conditional statements
 * loops
 * jump statement 
 */
public class ControlStatements {

	public static void main(String[] args) {
//		WAP that checks if a given variable which is used to denote a year
//		is a leap year
		short year = -1902;
		
		if (year < 0) {
//			System.out.println("The computer doesn't know how to process " + year + "BC");
			System.out.println("The computer doesn't know how to process " + (-year) + "BC");
		} else if (year%100==0) {
			System.out.println(year + " is a Century");
		} else if (year%4==0) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}
		
//		Create two variables to input `name` and `gender` of a person, and then depending on the gender print the name with proper prefix(Mr/Miss)
		
		System.out.println("---------Second Example-------");
		
		String name = "John Doe";
		String gender = "male";
		
//		This is open for volunteering
//		Good opportunity
		
//		System.out.println(gender =="male");
//		System.out.println(gender.toLowerCase());
//		System.out.println(gender.toLowerCase() == "male");
//		System.out.println(gender.toLowerCase().equals("male"));
//		System.out.println(gender == "Male");
//		if(gender == "male" || gender == "Male") {
//			System.out.println("Welcome Mr." + name);
//		} else {
//			System.out.println("Welcome Ms." + name);			
//		}
		
		if(gender == "male" || gender == "Male") {
		System.out.println("Welcome Mr." + name);
	} else if(gender == "female" || gender == "Female") {
		System.out.println("Welcome Ms." + name);			
	} else {
		System.out.println("Invalid Gender");
	}
		
		String prefix="Mr.";
		
		if (gender == "male" || gender == "Male") {
			
		} else if(gender == "female" || gender == "Female") {
			prefix = "Ms.";
		} else {
			System.out.println("Invalid gender");
//			System.exit(-5);
		}
		
		System.out.println("Welcome "+ prefix + " " + name);
		
		
		
		// For Loop
		
		// Assume that you get 0.2 rs everyday, now using a for loop and sum
		// print out the savings that you will have in 365 days
		
		System.out.println("-------Code using double-------");
		double savings = 0;
		for ( int i = 0; i<365; i++) { 
			savings += 0.2;
		}
		System.out.println("Savings by multiplication");
		System.out.println(365*0.2);
		System.out.println("Savings by addition");
		System.out.println(savings);
	
		
		System.out.println("-------Code using int------");
		
		int moneySaved = 0;
		
		for (int i= 0;i<366;i++) {
			moneySaved+=20;
		}
		
		System.out.println("Money saved = Rs." + (double)(moneySaved/100) );

	} // method main
} // class ControlStatement
