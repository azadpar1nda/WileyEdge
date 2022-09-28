package Com.Assignment;

import java.util.HashSet;
import java.util.Set;

public class StringContainsUniqueCharacter {

	public static Boolean checkUnique(String arr) {
		Set<Character> set=new HashSet<>();
		for(int i=0;i<arr.length();i++)
		{
			if(set.contains(arr.charAt(i))) {
				return false;
			}
			else {
				set.add(arr.charAt(i));
			}
			
		}

		return true;
	}
	public static void main(String[] args) {
		String s="@#$%^&&*(";
		System.out.println(checkUnique(s));
	}

}
