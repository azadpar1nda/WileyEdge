package Com.Assignment;

import java.util.HashSet;
import java.util.Set;

public class SetMatrix {
	public static void main(String args[])
	{
		Set<Integer>si= new HashSet<Integer>();
		Set<Integer>sj= new HashSet<Integer>();

		int n = 3;

	     int ar[][] = { { 1, 2, 3 },
	                     { 0, 5, 6 },
	                     { 7, 8, 9 } };
	     for(int i=0;i<n;i++)
	     {
	    	 for(int j=0;j<n;j++)
	    	 {
	    		 if(ar[i][j]==0)
	    		 {
	    			 si.add(i);
	    			 sj.add(j);
	    		 }
	    	 }
	     }
	     for(int i=0;i<n;i++)
	     {
	    	 for(int j=0;j<n;j++)
	    	 {
	    		 if(si.contains(i) || sj.contains(j))
	    		 {
	    			 ar[i][j]=0;	    		 }
	    	 }
	     }
	     for (int i = 0; i < n; i++) {
	         for (int j = 0; j < n; j++)
	             System.out.print(" " + ar[i][j]);

	         System.out.print("\n");
	     }
	     System.out.print("\n");
	}
}