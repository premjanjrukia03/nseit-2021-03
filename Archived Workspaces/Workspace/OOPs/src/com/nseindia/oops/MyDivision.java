package com.nseindia.oops;

public class MyDivision extends Division {

	public double getDoubleResult() {
		int divisor = this.getDivisor();
		int dividend = this.getDividend();
		
		return (double)dividend/(double)divisor;
	}
	
	// Overloading
	public void setDivisor(double divisor) {
		this.setDivisor((int)divisor);
	}
	
	
	// Integer.parseInt(String) -> int
	public void setDivisor(String divisor) {
		int divisorInt = Integer.parseInt(divisor);
		
		this.setDivisor(divisorInt);
	}
	
	public void setDividend(String dividend) {
		int dividendInt = Integer.parseInt(dividend);
		
		this.setDividend(dividendInt);
	}
	
	
	@Override
	public void printResult() {
		System.out.println("From Mydivision");
		System.out.println(this.getResult());
	}
	
}
