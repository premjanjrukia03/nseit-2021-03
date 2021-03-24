package com.nseindia.primes;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int number = 80000;
		
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

//		for(int i = 2; i <= number/2; i++) {
//			if (number%i==0) {
////				prime=false;
//				System.out.println(number + " is not a prime number");
////				in.close();
//				return;
//			}
//		}
		
	}

}
