package com.nseindia.students;

public class Final {
	public final int var;
	public final String varStr;
	
//	public setVar(int var) {
//		
//	}
//	
	
	public Final() {
		var = 0;
		varStr="";
	}
	
	public Final(int var, String str) {
		this.var = var;
		this.varStr= str;
	}

	public int getVar() {
		return var;
	}

	public String getVarStr() {
		return varStr;
	}
	
	// public void setVar(int var) {
	// 	this.var = var;
	// }
	
	
}
