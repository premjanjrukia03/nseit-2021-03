package com.nseindia.oops;

/*
 * for int division
 */
public class Division {
	// Encapsulation
	private int divisor, dividend;
	
	public int getDivisor() {
		
		return divisor;
	}

	public void setDivisor(int divisor) {
		System.err.println("Settting the divisor");
		if (divisor==0) {
//			this.divisor =1;
			System.err.println("Divide by Zero error");
			System.exit(-1);
			}
		this.divisor = divisor;
	}

	public int getDividend() {
		return dividend;
	}

	public void setDividend(int dividend) {
		this.dividend = dividend;
	}

	public int getResult() {
//		int dividend=3;
		return this.dividend/this.divisor;
	}
	
	public void printResult() {
		System.out.println("From Division");
		System.out.println(this.dividend/this.divisor);
	}
}


//this.divisor = divisor;
