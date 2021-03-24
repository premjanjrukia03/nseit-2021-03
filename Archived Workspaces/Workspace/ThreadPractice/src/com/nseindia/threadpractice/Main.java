package com.nseindia.threadpractice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Countdown cd = new Countdown();
		
		
		RunnableFor r1 = new RunnableFor(cd,"R1");
		Thread t1 = new Thread(r1);
		
		RunnableFor r2 = new RunnableFor(cd,"R2");
		Thread t2 = new Thread(r2);
		
		t1.start();
//		try {
//			
//			t1.join(); //block everythinghere
//			
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		t2.start();
		
	}

}
