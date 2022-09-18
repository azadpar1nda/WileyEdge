package com.Assignment6;

public enum AccountType {
	Saving(4),current(2);
	double interest;
	AccountType(double interest)
	{ this.interest=interest;
		
	}
	public double getInterestrate() {
		return this.interest;
	}
	
}
