package com.Assignment6;

public class ValidateEmail extends Exception{
	String Message;
	ValidateEmail(){
		this.Message="Your Email Is Invalid";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Message;
	}
	

}
