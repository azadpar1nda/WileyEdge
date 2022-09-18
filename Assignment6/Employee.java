package com.Assignment6;

import java.util.Arrays;

public class Employee {
	int empId;
	String empName;
	Address[] empAddress;
	
	public Employee(int empId, String empName, Address[] empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}
	



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + Arrays.toString(empAddress)
				+ "]";
	}




	public static void main(String[] args) {
		Employee e=new Employee(1,"Deepak",new Address[] {new Address(1,"Sonbarsa","Sarraya Road","Gorakhpur"),new Address(1,"Baikunthpur","Bishunpur Road","Gorakhpur")});
		System.out.println(e);
	}

	

}
