package com.Assignment6;

public class BankAccount {

	int accountId;
	String AccountHolderName;
	AccountType accountType;

	public BankAccount(int accountId, String accountHolderName, AccountType accountType) {
		super();
		this.accountId = accountId;
		this.AccountHolderName = accountHolderName;
		this.accountType = accountType;
	}
	public double calculateTotalInterest(double amount, int years) {
		double interest=amount*years*accountType.getInterestrate()/100;
		return interest;
	}
	public static void main(String[] args) {
		BankAccount e=new BankAccount(1,"Deepak",AccountType.Saving);
		BankAccount e1=new BankAccount(1,"Naga",AccountType.current);
		System.out.println(e.calculateTotalInterest(10000, 2));
		System.out.println(e1.calculateTotalInterest(10000, 2));
	}
	
}
