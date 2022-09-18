package com.Assignment6;


public class BankAccountWithException {

	int accountId;
	String AccountHolderName;
	AccountType accountType;

	public BankAccountWithException(int accountId, String accountHolderName, AccountType accountType) {
		super();
		this.accountId = accountId;
		this.AccountHolderName = accountHolderName;
		this.accountType = accountType;
	}
	public double calculateTotalInterest(double amount, int years) throws DepositAmountException{
		if(amount<0) {
			throw new DepositAmountException();
		}
		double interest=amount*years*accountType.getInterestrate()/100;
		return interest;
	}
	public static void main(String[] args) {
		BankAccountWithException e=new BankAccountWithException(1,"Deepak",AccountType.Saving);
		BankAccountWithException e1=new BankAccountWithException(1,"Naga",AccountType.current);
		try {
			System.out.println(e.calculateTotalInterest(10000, 2));
			System.out.println(e1.calculateTotalInterest(-10000, 2));
		} catch (DepositAmountException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
	}
	
}
