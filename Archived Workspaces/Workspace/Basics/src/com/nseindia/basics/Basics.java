package com.nseindia.basics;

/* This project contains examples and notes for
 * variables
 * data types
 * conversion and casting
 */

/*
 * for operators look back at Day2.md
 */
public class Basics {

	public static void main(String[] args) {
//		Sytem.out.println("Hello World");

		
		// Definition
		String greeting = "Hello World";
		
//		// Declaration
		int myNumber;
		
		// Assignment
		myNumber = 3;
		

		// Invalid Variable Names
//		int class = 3; // this is wrong because we're trying to give variable name as keyword class
		
		
		// Statement
		System.out.println(greeting);
		System.out.println(myNumber);
		
		// --------Variables End Here---------
		
		// --------Primitive Data Type--------
		
		// Two DataTypes: String, and int
		/* 8 Primitive Data Types
		 * byte		1,2,3
		 * short		-1,0,1,23
		 * int		whole numbers
		 * long		whole numbers
		 * float		decimal numbers 1.3
		 * double	decimal numbers 1.2
		 * char		'b','a','+','1'
		 * boolean	true/false
		 * 
		 * 
		 * String is not a primitive DataType. It's actually a Class
		 */
//		monthOfYear can be given byte
//		totalRevenue(assume it doesn't have decimal points) int/long
		byte varByte = 23; // Literal data type is integer
		short varShort = -2333;
		int varInt = 21312;
		long varLong = 212;
		float varFloat = 1.2f; // suffix f to a numeric literal defines it as float
		double varDouble = 1.2; // Decimal numbers without suffix are double
		char varChar = 'a'; // single quotes declares the literal as char
		boolean varBoolean = true; // keyword
//		Literals and Variable
//		Literals also have data types
		
		// 100 bytes, int's size is 4 bytes, 25 int
		// 100 bytes, byte's size is 1 byte, 100 bytes
		
		// Byte		1 byte
		// Short		2 Bytes
		// Int		4 Bytes
		// Long		8 Bytes
		// Float		4 Bytes
		// Double	8 Bytes  
		// Char		2 Bytes
		// boolean	Unknown Bytes
		
		// Range
		
		// Byte 1 byte = 8, 2^8 = 256
		// Short 2^16
		// Int 2^32
		// Long 2^64
			// 10^45;
		
		// Two types of Numeric Values
		// Signed (-128 to -1, 0 to 127) = 256
		// Unsigned (0 to 255)

		
		// STS SHortcut ctrl+alt+down arrow = copy selection down
//		STS Shortcut ctrl+space suggestions
		
		
		System.out.println(
				"Byte: Size = " + Byte.SIZE + " bits. " 
						+ "Min Value = " + Byte.MIN_VALUE + " "
						+ "Max Value = " + Byte.MAX_VALUE
				);
		
		
		System.out.println(
				"Short: Size = " + Short.SIZE + " bits. " 
						+ "Min Value = " + Short.MIN_VALUE + " "
						+ "Max Value = " + Short.MAX_VALUE
				);
		
		System.out.println(
				"Integer: Size = " + Integer.SIZE + " bits. " 
				+ "Min Value = " + Integer.MIN_VALUE + " "
				+ "Max Value = " + Integer.MAX_VALUE
				);
		
		System.out.println(
				"Long: Size = " + Long.SIZE + " bits. " 
						+ "Min Value = " + Long.MIN_VALUE + " "
						+ "Max Value = " + Long.MAX_VALUE
				);
		
		System.out.println(
				"Float: Size = " + Float.SIZE + " bits. " 
						+ "Min Value = " + Float.MIN_VALUE + " "
						+ "Max Value = " + Float.MAX_VALUE
				);
		
		System.out.println(
				"Double: Size = " + Double.SIZE + " bits. " 
						+ "Min Value = " + Double.MIN_VALUE + " "
						+ "Max Value = " + Double.MAX_VALUE
				);
		
		// Char is UTF-16
		System.out.println(
				"Character: Size = " + Character.SIZE + " bits. " 
						+ "Min Value = " + Character.MIN_VALUE + " "
						+ "Max Value = " + Character.MAX_VALUE
				);
		
		System.out.println(101.3232342342432342342342343223423443);
		
		String varКитайский = "I successfully printed Russian variable";
		
		System.out.println(varКитайский);
		
		int varDefaultInt=0;
		// Default Values, lecture = cancelled
		// sysout + ctrl+space
		// You cannot use a variable without assigning it a value
		System.out.println(varDefaultInt);
		
		// 0 10^1, 00 10^2
		// 0b 2^1, 00 2^2
		
		System.out.println("-------Overflow outputs--------");
		System.out.println("");
		
		System.out.println("Overflow Int"); //Overflow
		System.out.println("Max value is " + Integer.MAX_VALUE); //Overflow
		System.out.println(Integer.MAX_VALUE+1); //Overflow
		System.out.println("Underflow Int"); // Underflow
		System.out.println("Min value is " + Integer.MIN_VALUE); //Overflow
		System.out.println(Integer.MIN_VALUE-1); // Underflow
		
		
		System.out.println("------- Trying Overflow and Underflow with float and Double------");
		
		System.out.println("Overflow Double"); //Overflow
		System.out.println("Max value is " + Double.MAX_VALUE); //Overflow
		System.out.println(Double.MAX_VALUE+1); //Overflow
		System.out.println("Underflow Double"); // Underflow
		System.out.println("Min value is " + Double.MIN_VALUE); //Overflow
			System.out.println(Double.MIN_VALUE-1); // Underflow
		
		// Double doesn't have the same underflows and overflows as INT
		
		// --------Implicit Conversions and Casting-------
		
//		Strings, Double, and Int enjoy favoritism in Java
		
		System.out.println("-------Output for COnversions and casting--------");
		
		int convInt = 3;
		
		System.out.println("convInt + 1 is " + convInt +1); 
		System.out.println(convInt +1 + " convInt + 1 is " + 5 + 3); 
		
		System.out.println(Byte.MAX_VALUE+1); //Overflow with byte+int
		
		// int + short/long/byte = int
		// double + int = double
		// String + double + int = String
		
		System.out.println((int)(3.3));
		System.out.println((int)(3.9));
		// Offline Work: Try out compatible Castings
		
		 System.out.println((char)(60+5));
//		3.5,4.5,9999.99 what is the datatype i should use for values like this?
//		 double
//		 System.out.println(14_13_12_11_73_35_18_53_123.11);
//		 BigDecimal
		 
		 
		 System.out.println((char)(int)60+5);
		 
		 System.out.println((char)((int)60+5));
	}

}
