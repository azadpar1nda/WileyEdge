package com.ElectricityBillGenerator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerApp  {
	@SuppressWarnings({ "static-access" })
	public static void main(String[] args) {

		List<Customer> customer = new ArrayList<Customer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Customer");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Customer Id, Customer Name, Customer Area Code, and Number Of Units Used "+(i+1));
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			String code=sc.nextLine();
			int nou=sc.nextInt();
			double bill=CustomerUtility.calculateTotalBill(nou);
			customer.add(new Customer(id,name,code,nou,bill));
		}
		sc.close();
		
		
		CustomerUtility.display(customer);
		CustomerUtility.sort(customer);
		CustomerUtility.search("Max104", customer);
		CustomerUtility.MethodSerializable(customer);
		System.out.println("-----------------------------------------");
		List<Customer> llist=CustomerUtility.ReadObjects();
		llist.forEach((c)->System.out.println(c));
		System.out.println("---------------------------");
        System.out.println();
		CustomerUtility.groupBy(customer);
	

	}

}


