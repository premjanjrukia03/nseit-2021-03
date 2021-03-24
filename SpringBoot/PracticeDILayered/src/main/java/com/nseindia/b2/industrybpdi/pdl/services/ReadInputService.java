package com.nseindia.b2.industrybpdi.pdl.services;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReadInputService {
	@Autowired
	Scanner in;
	
	public void run() {
		System.out.print("Enter an integer: ");
		int i = in.nextInt();
		System.out.println("The entered Integer is " + i);
	}
}
