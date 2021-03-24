package com.nse.concurrency;

public class Main {

	public static void main(String[] args) {
		
		//-------------Creating threads using Thread Class ---------//
//		MyThread t = new MyThread();
//		t.setName("t");
//		t.start(); //t
//		t.setName("t1");
//		MyThread t2 = new MyThread();
//		t2.setName("t2");
//		t2.start();
//		MyThread t3 = new MyThread();
//		t3.setName("t3");
//		t3.start();
		
		
//		int i = 4;
//		
//		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		System.out.println(i);
//		i=5;
		
//		fromMain();
		
		// ----------------Creating Threads using Runnable Interface------------
		
		MyRunnable r1 = new MyRunnable();
		r1.setName("Thread1");
		Thread t = new Thread(r1);
		t.start();
		
		MyRunnable r2 = new MyRunnable();
		r2.setName("Thread2");
		Thread t2 = new Thread(r2);
		t2.start();
	}

	
	public static void fromMain() {
		System.out.println("This message is from Main");
	}
}
