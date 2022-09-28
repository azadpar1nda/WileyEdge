package com.ElectricityBillGenerator;

import java.util.Comparator;

public class CompareBill implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o2.getTotalBill() > o1.getTotalBill() ? 1 : -1;
	}

}