package Assignment4;

public enum AccountType {
	Saving(500),Current(1000);
	private double minBalance;
	AccountType(double amount) {
		this.minBalance=amount;
	}
	public boolean checkMinBal(double amount) {
		if(this.minBalance>amount)
		{
			return false;
		}
		else {
			return true;
		}
	}
	
}
