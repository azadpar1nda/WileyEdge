package Com.Assignment;

import java.util.Scanner;

public class MagicIndex {
	
	public static int checkIndex(int i,int[] arr,int n) {
		int ans=-1;
		if(arr[i]==i)
		{
			return i;
		}
		else if(i==n)
		{
			return -1;
		}
		else
		{
			ans=checkIndex(i+1,arr,n);
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] arr=new int[] {2,2,3,4,5,5,6,4,6,7};
		System.out.println("Enter the Number");
		int index=checkIndex(0,arr,arr.length);
		System.out.println(index);

	}

}
