package com.Assignment6;

public class DepositAmountException extends Exception {
	String Message;

	DepositAmountException() {
		super();
		Message = "Amount Must be Positive";
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return Message;
	}

	
	
	

}
