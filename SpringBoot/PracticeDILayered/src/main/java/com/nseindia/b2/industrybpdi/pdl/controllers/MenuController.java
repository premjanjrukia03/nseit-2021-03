package com.nseindia.b2.industrybpdi.pdl.controllers;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nseindia.b2.industrybpdi.pdl.services.FindIfPrimeService;
import com.nseindia.b2.industrybpdi.pdl.services.ReadInputService;
import com.nseindia.b2.industrybpdi.pdl.services.SortInputService;
import com.nseindia.b2.industrybpdi.pdl.services.SumDigitsService;

@Controller
public class MenuController {
	@Autowired
	ReadInputService ri;

	@Autowired
	SumDigitsService sds;
	
	@Autowired
	FindIfPrimeService fip;
	
	@Autowired
	SortInputService sis;
	
	@Autowired
	Scanner in;
	
	public void run() {
	
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
				ri.run();
//				readInput();
				break;
			case 2:
				System.out.println("will not be implemented");
//				swapVariables();
				break;
			case 3:
				sds.run();
//				getSumDigits();
				break;
			case 4:
				
//				findIfPrime();
				break;
			case 5:
				
//				scanAndSortArray();
				break;
			case 0:
				break menu;
			default:
				System.err.println("Invalid choice");
				break;
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while(true);
		
		System.out.println("Closing the program");
		
	}
}
