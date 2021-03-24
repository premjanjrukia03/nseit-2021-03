package com.nseindia.blockingqueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
// Add Synchronized

/*
 * LYD is leap year detector
 */
public class LYD {
	// Queue is a FIFO
	// Excellent Data Structure to be used on buffers
	ArrayBlockingQueue<Integer> inputYears = new ArrayBlockingQueue<Integer>(6);
	List<String> output = Collections.synchronizedList(new ArrayList<String>());
//	List<String> output = new SynchronizedList<String>(new ArrayList<String>());
//	make  the above statement work by using the proper import statement.


	boolean pFinished = false;
//	ReentrantLock lock = new ReentrantLock();

	// ------This is new from here

	public void add(Integer i) {
//		System.out.println(Thread.currentThread().getName() + " waits for the lock");
//		lock.lock();
//		System.out.println(Thread.currentThread().getName() + " gets the lock");


			try {
				// t1
				// t2
				// producer blocked because 6 elements in an array
				this.inputYears.put(i);
				// once we fill the buffer completely
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//t1
			//t2
			System.out.println(this);
		

	}

	public void test() {
//		System.out.println(Thread.currentThread().getName() + " waits for the lock");
//		lock.lock();
//		System.out.println(Thread.currentThread().getName() + " gets the lock");
		Integer year;

			year = this.inputYears.poll(); // state of the array is change

			if (year==null) {
				return;
			}
			if (year % 4 == 0) {
				this.output.add(year + " is a leap year");
			} else {
				this.output.add(year + " is not a leap year");
			}

			System.out.println(this);
		
	}

	// ------ till here

	public Queue<Integer> getInputYears() {
		return inputYears;
	}

	public void setInputYears(ArrayBlockingQueue<Integer> inputYears) {
		this.inputYears = inputYears;
	}

	public List<String> getOutput() {
		return output;
	}

	public void setOutput(List<String> output) {
		this.output = output;
	}

	@Override
	public String toString() {
		return "LYD [inputYears=" + inputYears + ", output=" + output + "]";
	}
}

class Consumer implements Runnable {
	private LYD lyd;

	@Override
	public void run() {
//		
		int counter = 0;
		while (!lyd.pFinished) {
			if (!lyd.inputYears.isEmpty()) {
				counter++;
				lyd.test();
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("Consumer terminated with " + counter + " hits");

	}

	public Consumer(LYD lyd) {
		this.lyd = lyd;
	}

}

class Producer implements Runnable {
	private LYD lyd;

	int[] arr = new int[] {};

	@Override
	public void run() {
		for (int j = 0; j < arr.length; j++) {
			lyd.add(arr[j]); // state of the list
//			System.out.println(lyd);
		}

		int i;
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Enter a leap year(0 to exit): ");
			if (scan.hasNext()) {
				i = scan.nextInt();
				if (i == 0) {
					lyd.pFinished = true;
					break;
				}
				lyd.add(i);
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		}

		System.out.println("Producer terminated");
	}

	public Producer(LYD lyd) {
		this.lyd = lyd;
	}

	public Producer(LYD lyd, int[] arr) {
		this.lyd = lyd;
		this.arr = arr;
	}

}