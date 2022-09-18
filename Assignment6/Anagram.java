package com.Assignment6;

import java.util.ArrayList;
import java.util.Collections;

public class Anagram {

	public static void main(String[] args) {
		String a="Deepak";
		String b="Maurya";
		int flag=0;
		if(a.length()==b.length())
		{
			ArrayList<Character> arr1=new ArrayList<>();
			ArrayList<Character> arr2=new ArrayList<>();
			for(int i=0;i<a.length();i++) {
				arr1.add(a.charAt(i));
			}
			for(int i=0;i<b.length();i++) {
				arr2.add(b.charAt(i));
			}
			Collections.sort(arr1);
			Collections.sort(arr2);
			for(int i=0;i<a.length();i++)
			{
				if(arr1.get(i)!=arr2.get(i)) {
					flag=1;
				}
			}
			if(flag==1)
			{
				System.out.println("Not Anagram");
			}
			else
			{
				System.out.println("Anagram");
			}
		}
		else {
			System.out.println("Not Anagram");
		}
		
	}

}
