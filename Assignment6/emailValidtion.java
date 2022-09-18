package com.Assignment6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailValidtion {
	public static void validateEmail(String email) throws ValidateEmail {
		 String regex = "^(.+)@(.+)$";  
		 Pattern pattern = Pattern.compile(regex);  
		 Matcher matcher = pattern.matcher(email);  
		 if(matcher.matches()) {
			 System.out.println("Your email is valid");
		 }
		 else
		 {
			 throw new ValidateEmail();
		 }
		  
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your email :");
		String email=sc.nextLine();
		try {
			validateEmail(email);
		} catch (ValidateEmail e) {
			
			e.printStackTrace();
		}
		
	}
}
