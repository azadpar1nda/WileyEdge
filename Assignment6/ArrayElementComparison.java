package com.Assignment6;

import java.util.Scanner;

public class ArrayElementComparison {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int n=sc.nextInt();
		if(n<5)
		{
			System.out.println("Array Size Must be more than 5");
		}else
		{
			int[] arr=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			if(arr[0]==arr[n-1])
			{
				System.out.println("Elements are Same");
			}
			else
			{
				System.out.println("Element are not same");
			}
		}
}
}
