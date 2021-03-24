package com.nseindia.producerconsumer;

import java.util.*;


/*
 * LYD is leap year detector
 */
public class LYD {
	List<Integer> inputYears = new ArrayList<Integer>();
	List<String> output = new ArrayList<String>();
	boolean pFinished = false;
	
	public List<Integer> getInputYears() {
		return inputYears;
	}
	public void setInputYears(List<Integer> inputYears) {
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

class Consumer implements Runnable{
	private LYD lyd;
	@Override
	public void run() {
//		
		int counter =0;
		while(!lyd.pFinished || !lyd.inputYears.isEmpty() ) {
			if(!lyd.inputYears.isEmpty() ) {
				counter++;
//				lyd.inputYears a single element, let's say 300
				int year;
				synchronized (lyd) {
					if (lyd.inputYears.isEmpty()) {
						return;
					}
					year = lyd.inputYears.remove(0); // state of the array is change
					if (year % 4 == 0) {
						lyd.output.add(year + " is a leap year");
					} else {
						lyd.output.add(year + " is not a leap year");
					}	
					System.out.println(lyd);
				}
			}
		}
			
			
		
		System.out.println("Consumer terminated with " + counter + " hits");
		
	}
	
	public Consumer(LYD lyd) {
		this.lyd = lyd;
	}
	
}


class Producer implements Runnable{
	private LYD lyd;
	int arr[];
	
	@Override
	public void run() {
		for (int i=0; i<arr.length;i++) {
			synchronized (lyd) {				
				lyd.inputYears.add(arr[i]); // state of the list
				System.out.println(lyd);	
			}
			// Following are not the literal example of how println works
			// Just came up with them for explanation
			// evalutate value of lyd
			// set it somewhere
			// setup resources for print
			// print a line
			// close connections
			// release
		}
		System.out.println("Producer terminated");
	}
	
	public Producer(LYD lyd,int[] arr) {
			this.lyd = lyd;
			this.arr=arr;
	}
	
}