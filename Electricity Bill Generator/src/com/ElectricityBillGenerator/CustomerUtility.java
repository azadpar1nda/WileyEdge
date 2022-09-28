package com.ElectricityBillGenerator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CustomerUtility {

	private static List<Customer> list;
	
	public static boolean display(List<Customer> customer) {
		System.out.println("Our Customers are :");
		customer.stream().forEach((c) -> System.out.println(c));
		return true;
	}

	public static boolean sort(List<Customer> customer) {
		System.out.println("\nCustomers Sorted According to Their Bill :");
		customer.sort((c1,c2)->c1.getTotalBill()<c2.getTotalBill()?1:-1);
		customer.stream().forEach((c) -> System.out.println(c));
		return true;
	}

	public static boolean search(String areaCode, List<Customer> customer) {
		System.out.println("\nCustomer With Area Code Max104 is :");
		customer.stream().filter((c) -> c.getCustomerAreaCode().equals(areaCode)).forEach((c) -> System.out.println(c));
		return true;
	}
	
	public static double calculateTotalBill(int units) {
		double amount = 0.0;
		if (units > 150) amount = (units - 150); units = 150;
		if (units <= 150 && units >= 101) amount = amount + (units - 100) * 0.75; units = 100;
		if (units <= 100) amount = amount + (units) * 0.50;
		return amount;
	}
	
	public static void MethodSerializable(List<Customer> llist){
		try {
			FileOutputStream fos=new FileOutputStream("README.file");
			ObjectOutputStream ob=new ObjectOutputStream(fos);
			ob.writeObject(llist);
			System.out.println("Serialized");
			ob.close();
		}catch(Exception e) {
			e.getStackTrace();
		}
	}
		//Deserialization
	@SuppressWarnings("unchecked")
	public static List<Customer> ReadObjects(){
		try (ObjectInputStream ob1=new ObjectInputStream(new FileInputStream("README.file"))){
				list=(List<Customer>)ob1.readObject();	
		}catch(Exception e) {
			e.getStackTrace();
		}
		return list;
	}
	public static void groupBy(List<Customer> list) {

		Map<String, List<Customer>> mm = Optional.ofNullable(list).orElseGet(ArrayList::new).stream()
				.collect(Collectors.groupingBy(Customer::getCustomerAreaCode));

		for (Map.Entry<String, List<Customer>> entry : mm.entrySet()) {
			System.out.print(entry.getKey() + ":");
			int x = 0;
			for (Customer c : entry.getValue()) {
				if (x > 0) {
					System.out.println("       " + c);
				} else {
					System.out.println(c);
					x++;
				}
			}
		}
	}
}
