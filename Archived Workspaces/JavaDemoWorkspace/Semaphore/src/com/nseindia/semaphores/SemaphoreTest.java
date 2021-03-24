package com.nseindia.semaphores;

import java.util.concurrent.Semaphore;

public class SemaphoreTest implements Runnable {
	Semaphore sem;

	public void run() {
		countdown();
	}

	public SemaphoreTest(Semaphore sem) {
		super();
		this.sem = sem;
	}

	public void countdown() {
		try {
			// t0
			// t1
			// t2
			// t3
			sem.acquire(); // decrements the counter. 1->0
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + ":" + " i = " + i);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sem.release(); // increments the count. 0->1
		}

	}

}
