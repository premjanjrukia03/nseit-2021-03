package com.nseindia.threadsafe;

public class Main {

	public static void main(String[] args) {
		LYD lyd = new LYD();
		int[] arr = new int[] {2000,2001,199,101,22,2000,2001,199,101,22,2000,2001,199,101,22};
		
//		Thread producer = new Thread(new Producer(lyd));
		Thread producer = new Thread(new Producer(lyd,arr));
		Thread consumer = new Thread(new Consumer(lyd));
		Thread consumer1 = new Thread(new Consumer(lyd));
		
		producer.start();
		consumer.start();
		consumer1.start();
	}

}
