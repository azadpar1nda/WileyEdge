package Assignment4;
public class BankAccountSavingCurrent {
	static double totalBalance;
	int accountId;
	String accountHolderName;
	double openingBalance;
	double currentBalance;
	public BankAccountSavingCurrent(int accountId, String accountHolderName, double openingBalance, AccountType acc) {
		super();
		if(acc==AccountType.Saving) {
			if(acc.checkMinBal(openingBalance))
			{
				System.out.println("Account Created");
				this.accountId = accountId;
				this.accountHolderName = accountHolderName;
				this.openingBalance = openingBalance;
				this.currentBalance =openingBalance;
				totalBalance+=openingBalance;
			}
			else
			{
				System.out.println("Account Not Created");
				
			}
		}
		if(acc==AccountType.Current) {
			if(acc.checkMinBal(openingBalance))
			{
				System.out.println("Account Created");
				this.accountId = accountId;
				this.accountHolderName = accountHolderName;
				this.openingBalance = openingBalance;
				this.currentBalance =openingBalance;
				totalBalance+=openingBalance;
			}
			else
			{
				System.out.println("Account Not Created");
			}
		}
		
		
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
		BankAccountSavingCurrent account1=new BankAccountSavingCurrent(1,"Deepak Maurya",1000,AccountType.Saving);
		BankAccountSavingCurrent account2=new BankAccountSavingCurrent(2,"Nikhil",1000,AccountType.Current);
		account1.depositAmount(6000);
		account2.depositAmount(9000);
		displayAmount();

	}



}
