package com.nseindia.semaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntBinaryOperator;

public class Main {

	public static void main(String[] args) {
		Semaphore sem = new Semaphore(3);
		Runnable r = new SemaphoreTest(sem);
		ExecutorService exec = new ScheduledThreadPoolExecutor(5);
		exec.execute(r);
		exec.execute(r);
		exec.execute(r);
		exec.execute(r);
		exec.execute(r);
		exec.execute(r);
		exec.execute(r);
		exec.execute(r);
		
		AtomicInteger i = new AtomicInteger();
		i.set(2);
		i.incrementAndGet(); // ++i
		i.getAndIncrement(); // i++
		i.accumulateAndGet(3, null);
	}
	
	class add implements IntBinaryOperator{

		@Override
		public int applyAsInt(int left, int right) {	
			return left + right;
		}
		
	}

}
