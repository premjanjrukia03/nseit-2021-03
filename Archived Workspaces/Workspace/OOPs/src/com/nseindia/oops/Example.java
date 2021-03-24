package com.nseindia.oops;


public class Example {
	int attr1 =3;
	String attr2 = "This is an attribute";
	double attr3 = 1.3;
	String name = "Inside Job";
	
	
	
	public int addAttr1(int operand) {
		return operand + attr1;
	}
	
	public void setName(String name) {
		System.out.println("name = " + name);
		System.out.println("this.name = " + this.name);
	}

	@Override
	public String toString() {
		return "Sample [attr1=" + attr1 + ", attr2=" + attr2 + ", attr3=" + attr3 + ", name=" + name + "]";
	}
	
}
