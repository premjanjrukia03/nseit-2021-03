package com.nse.concurrency;

public class MyThread extends Thread{

	@Override
	public void run() {
		System.out.println("From a new thread: " + 	currentThread().getName());
	}
	
}
