package Com.Assignment;

import java.util.*;

class PossibleParanthesis {

	public static void getParenthesis(int n, int open, int close, String s, ArrayList<String> ans)
	{
		if (open == n && close == n) {
			ans.add(s);
			return;
		}
		if (open < n) {
			getParenthesis(n, open + 1, close, s + "{", ans);
		}
		if (close < open) {
			getParenthesis(n, open, close + 1, s + "}", ans);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the Number Of Paranthesis : ");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> ans = new ArrayList<>();
		getParenthesis(n, 0, 0, "", ans);
		int count=0;
		for (String s : ans) {
			System.out.println(s);
			count++;
		}
		System.out.println("<---------------------------------------------------->");
		System.out.println("Number Of valid Paranthesis is : "+count);
	}
}


