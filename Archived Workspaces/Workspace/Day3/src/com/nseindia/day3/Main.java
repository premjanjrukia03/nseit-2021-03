package com.nseindia.day3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
//	static int[] primeList = new int[4000];

	public static void main(String[] args) {
		
//		testMethod();
		
		// Write a program that takes four inputs, int, String, boolean, double.
		// Store these values in variables
		// Print the value of these variables
//		readInput();
		
		// read inside the method
//		swapVariables();
		
		// WAP which takes an integer as an input,
		// and prints the sum of the digits of that integer
		// try do..while and while
		// 34, 7
		// 18,9
		// 4234234234,
//		getSumDigits();
		
		// WAP to display a menu on the cli, and depending on the option chosen
		// run a specific method
//		showMenu();
		// WAP to read the length of an array from.cli
		// create that array
		// read int values into that array from the cli.
		// print the array
		
//		readArray();
		
		// WAP that takes in an array from the cli
		// sort it and print the result out
		// i will resume at 3:08
//		scanAndSortArray();
		
//			findIfPrime();	
		
		listPrime(100);
	}
	
	static void testMethod() {
		System.out.println("Testing the method out");
	
	}
	
	static void readInput() {
		Scanner in = new Scanner(System.in);
		Scanner inStr = new Scanner(System.in);
//		System.err.println("Invalid Value");
		// CTRL + Shift + o
		// import java.util.Scanner;
		// to use Scanner
		
		// fd 0-255
		// 0 is normally mapped to stdin
		// 1 is mapped to stdout
		// 2 is mapped to stderr

		// int
		System.out.print("Enter an integer: ");
		int i = in.nextInt();
		System.out.println("The integer is " + i);
		
		System.out.print("Enter an integer: ");
		 i = in.nextInt();
		System.out.println("The integer is " + i);
		
		//String, 
		System.out.print("Enter a String: ");
//		String str = inStr.next();
		String str = inStr.nextLine();
		// 3 5 \r\n
		System.out.println("The string is " + str);
		
//		Sample input
		/*
		 * Enter an integer: 3 5 this is a string
		The integer is 3
		Enter an integer: The integer is 5
		Enter a String: The string is  this is a string
		 */
		
		//boolean,
		
		System.out.println("Enter boolean");
		boolean bool = in.nextBoolean();
		System.out.println(bool);
		
		
		// double.
		System.out.println("Enter double value");
		double decimal = in.nextDouble();
		System.out.println(decimal);
		
//		in.close();
//		inStr.close();
	}	
	
	static void swapVariables() {
		int a,b;
		a=3;
		b=4;
		
		System.out.println(a+ "," + b);
		//write a code below that swaps the value of a and b
//		int temp;
//		temp = a; // temp=3,a=3,b=4
//		a=b; // temp=3,a=4,b=4
//		b=temp; //temp=3,a=4,b=3
		
		
		// a=3,b=4
		a = a+b; // a= a+b, b= b
		b = a-b; // a = a+b, b=a
		a = a-b; // a=b, b=a
		
		// don't write anything below this comment
		
		System.out.println(a+ "," + b);
	}
	
	static void getSumDigits() {
		int i,n;
		int sum=0;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		i = in.nextInt();
		// 35,63213
		
//		if (i<0) {
//			System.err.println("i should be a positive integer");
//		}
		
		if (i<0) {
			i = -i;
			System.out.println("Ignoring the minus sign");
		}
		
		n=i;
		while(n>0) {
			sum += n%10;
			n/=10;
		}
		
		System.out.println("Sum of digits of number " + n + " is "  + sum);
//		in.close();
	}

	static void findIfPrime() {
		Scanner in = new Scanner(System.in);

	
		long number;
//		boolean prime = true;
		System.out.print("Enter an Integer value: ");
		number = in.nextLong();
		
		if(number==0 || number==1) {
			System.err.println("0 and 1 are not prime numbers");
//			in.close();
			return;
		} 

		for(int i = 2; i <= number/2; i++) {
			if (number%i==0) {
//				prime=false;
				System.out.println(number + " is not a prime number");
//				in.close();
				return;
			}
		}
			System.out.println(number + " is a prime number");
//		if (prime) {
//			System.out.println(number + " is a prime number");
//		} else {
//			System.out.println(number + " is not a prime number");
//		}
			
//		in.close();
	}

	static void listPrime(int number ) {		
		int[] primeList = new int[number];//0,0,0,0,0
		int count = 0;
		int num = 2;
		
		
		
		boolean prime;
		while(count<number) {
			prime=true;
			for (int i=0;i<count-1;i++) {				
				if(num%primeList[i]==0) {
					prime=false;
					break;
				}
			}
			if (prime) {
				primeList[count]=num;
				count++;
			}		
			num++;
		}
		System.out.println(Arrays.toString(primeList));
		System.out.println(primeList[7999]);
		
	}
	
static void scanAndSortArray() {
		int[] arr = readArray();
		
//		System.out.println("from scanAndSorted" + Arrays.toString(arr));
		// [3,2,1]
		int min = 0;
		int n = arr.length;
		
		// [3,2,1]
		
		
		for (int i=0;i<n;i++) {
			
			for(int j=i;j<n;j++) {
				if (arr[j]<arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i]= arr[min];
			arr[min] = temp;
			System.out.println(i + " " + min);
			System.out.println(Arrays.toString(arr));
		}
	}
	
	static int[] readArray() {
		Scanner in = new Scanner(System.in);
			
		System.out.print("Enter the capacity of the array: ");
		int cap = in.nextInt();
		int[] arr = new int[cap];
		
		System.out.println("Enter the elements for the array: ");
		for (int i =0; i<cap; i++) {
			arr[i]= in.nextInt();	
		}
//		for (int i =0; i<cap; i++) {
//			System.out.print(arr[i] + " ");	
//		}
		
		System.out.println(Arrays.toString(arr));
		
//		in.close();
		return arr;
	}
	
	static void showMenu() {
		Scanner in = new Scanner(System.in);
		int choice;
		
		menu: do {			
			System.out.println("Choose a program:");
			System.out.println("1. Read Input\n"
					+ "2. Swap Two Variables (No Input Required)\n"
					+ "3. Sum of digits of an Integer\n"
					+ "4. Find if a given integer is prime\n"
					+ "5. Sorting a given array\n" 
					+ "0. Exit");
			System.out.print("Choice: ");
			choice = in.nextInt();
			switch(choice) {
			case 1:
				readInput();
				break;
			case 2:
				swapVariables();
				break;
			case 3:
				getSumDigits();
				break;
			case 4:
				findIfPrime();
				break;
			case 5:
				scanAndSortArray();
				break;
			case 0:
				break menu;
			default:
				System.err.println("Invalid choice");
				break;
			}
		} while(true);
		
		System.out.println("Closing the program");
		in.close();
	}
}
