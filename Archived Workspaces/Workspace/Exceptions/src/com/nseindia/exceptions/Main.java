package com.nseindia.exceptions;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		
//		int i =10/0;
//		String str = null;
//		str.getBytes();
		
//		try {
////			int i =10/0;
////			String str = "Test";
//			String str = null;
//			str.getBytes();
//		} catch (ArithmeticException e) {
//			System.err.println("Was expecting this one");
//			System.err.println(e);
//		} catch (Exception e) {
//			System.err.println("Was not expecting this one");
//			System.err.println(e);
//		} finally {
//			// release resources
//			System.out.println("Inside Finally");
//		}
		
		testingFinally();
	}
	
	public static void testingFinally() {
		int dividend = 30;
		
		for(int divisor=5; divisor>=-2 ;divisor--) {
			Scanner in = new Scanner(System.in);
			try {
				if(divisor == 4) {
					continue;
				}
					System.out.println(dividend + "/" + divisor + " = " +(dividend/divisor));
			} catch(Exception e) {
				System.err.println(e);
				continue;
			} finally {
				in.close();
				System.out.println("Scanner closed for divisor " + divisor);				
			}
		}
	}
	


}
