package com.ElectricityBillGenerator;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Customer implements Serializable{
	private int customerId;
	private String customerName;
	private String customerAreaCode;
	private int numberofUnitsConsumed;
	private double totalBill;

	public Customer(int customerId, String customerName, String customerAreaCode, int numberofUnitsConsumed,double bill) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAreaCode = customerAreaCode;
		this.numberofUnitsConsumed = numberofUnitsConsumed;
		this.totalBill = bill;
	}
	
	public String getCustomerAreaCode() {
		return customerAreaCode;
	}

	public double getTotalBill() {
		return totalBill;
	}
	@Override
	public String toString() {
		return "Id : " + customerId + ", Name : " + customerName + ", AreaCode: " + customerAreaCode
				+ ", UnitsConsumed : " + numberofUnitsConsumed + ", TotalBill : " + totalBill;
	}
}
