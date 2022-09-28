package com.ElectricityBillGenerator;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CustomerUtilityTest {
	
	@Test
	void testDisplay() {
		List<Customer> customer=new ArrayList<>();
		customer.add(new Customer(1,"Deepak","123456",358,CustomerUtility.calculateTotalBill(358)));
		customer.add(new Customer(2,"Naga","123457",345,CustomerUtility.calculateTotalBill(345)));
		customer.add(new Customer(3,"jaid","123456",2675,CustomerUtility.calculateTotalBill(2675)));
		customer.add(new Customer(4,"Sagar","123458",7465,CustomerUtility.calculateTotalBill(7465)));
		customer.add(new Customer(5,"Mohit","123459",3455,CustomerUtility.calculateTotalBill(3455)));
		assertEquals("It is Working",true,CustomerUtility.display(customer));
	}

	@Test
	void testSort() {
		List<Customer> customer=new ArrayList<>();
		customer.add(new Customer(1,"Deepak","123456",358,CustomerUtility.calculateTotalBill(358)));
		customer.add(new Customer(2,"Naga","123457",345,CustomerUtility.calculateTotalBill(345)));
		customer.add(new Customer(3,"jaid","123456",2675,CustomerUtility.calculateTotalBill(2675)));
		customer.add(new Customer(4,"Sagar","123458",7465,CustomerUtility.calculateTotalBill(7465)));
		customer.add(new Customer(5,"Mohit","123459",3455,CustomerUtility.calculateTotalBill(3455)));
		assertEquals("It is Working",true,CustomerUtility.sort(customer));
	}

	@Test
	void testSearch() {
		List<Customer> customer=new ArrayList<>();
		customer.add(new Customer(1,"Deepak","123456",358,CustomerUtility.calculateTotalBill(358)));
		customer.add(new Customer(2,"Naga","123457",345,CustomerUtility.calculateTotalBill(345)));
		customer.add(new Customer(3,"jaid","123456",2675,CustomerUtility.calculateTotalBill(2675)));
		customer.add(new Customer(4,"Sagar","123458",7465,CustomerUtility.calculateTotalBill(7465)));
		customer.add(new Customer(5,"Mohit","123459",3455,CustomerUtility.calculateTotalBill(3455)));
		assertEquals("It is Working",true,CustomerUtility.search("123456",customer));
	}

}
