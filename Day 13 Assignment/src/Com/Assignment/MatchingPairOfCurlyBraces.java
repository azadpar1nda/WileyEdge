package Com.Assignment;

import java.util.Scanner;
import java.util.Stack;

public class MatchingPairOfCurlyBraces {

	public static Boolean check(String s) {
		if (s.length() % 2 != 0) {
			return false;
		}
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='{') {
				stack.push(s.charAt(i));
			}
			if(s.charAt(i)=='}'){
				if(stack.isEmpty())
				{
					return false;
				}
				if(stack.peek()=='{') {
					stack.pop();
				}
			}
			if(stack.isEmpty()) {
				return true;
			}
		}

		return false;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(check(s));

	}

}
