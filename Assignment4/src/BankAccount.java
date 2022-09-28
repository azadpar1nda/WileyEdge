package Assignment4;

public class BankAccount {
	static double totalBalance;
	int accountId;
	String accountHolderName;
	double openingBalance;
	double currentBalance;
	public BankAccount(int accountId, String accountHolderName, double openingBalance) {
		super();
		if(openingBalance<0)
		{
			System.out.println("Amount is less than 0 can't open your account");
		}
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.openingBalance = openingBalance;
		this.currentBalance =openingBalance;
		totalBalance+=openingBalance;
	}
	public void withdrawAmount(double amount) {
		if(currentBalance==amount) {
			System.out.println("You Can't Withdraw less Than "+amount);
		}
		else if(currentBalance<amount) {
			System.out.println("Insufficient Balance");
		}
		else {
			this.currentBalance-=amount;
			totalBalance-=amount;
		}
		System.out.println(" Your Balance is "+ this.currentBalance);
	}
	public static void displayAmount(){
		System.out.println("Total amount in bank is "+totalBalance);
	}
	public void depositAmount(double amount) {
		this.currentBalance+=amount;
		totalBalance+=amount;
		System.out.println(" Your Balance is "+ this.currentBalance);
	}
	public static void main(String[] args) {
		BankAccount account1=new BankAccount(1,"Deepak Maurya",5000);
		BankAccount account2=new BankAccount(2,"Deepak Sharma",50000);
		BankAccount account3=new BankAccount(3,"Nikhil",7000);
		account1.withdrawAmount(1000);
		account2.depositAmount(3000);
		account3.withdrawAmount(7000);
		displayAmount();

	}



}
