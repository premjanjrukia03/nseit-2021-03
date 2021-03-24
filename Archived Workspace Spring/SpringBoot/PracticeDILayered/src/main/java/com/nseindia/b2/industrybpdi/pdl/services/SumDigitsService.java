package com.nseindia.b2.industrybpdi.pdl.services;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SumDigitsService {
	@Autowired
	Scanner in;
	
	public void run() {
		int i, n;
		int sum = 0;

		System.out.print("Enter an integer: ");
		i = in.nextInt();
		if (i < 0) {
			i = -i;
			System.out.println("Ignoring the minus sign");
		}

		n = i;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}

		System.out.println("Sum of digits of number " + i + " is " + sum);
	}
}
