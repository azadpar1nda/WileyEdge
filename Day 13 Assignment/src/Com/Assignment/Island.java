package Com.Assignment;

import java.util.Scanner;

public class Island {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] tda=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				tda[i][j]=sc.nextInt();
			}
		}
		m=m-1;
		n=n-1;
		Boolean b=true;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(tda[i][j]==1) {
				if(i==0 && j==0) {
					if((tda[i+1][j]==1)||(tda[i][j+1]==1)||(tda[i+1][j+1]==1)) {
						b=false;
						break;
					}
				}else if(i==0 && j==n) {
					if((tda[i+1][j]==1)||(tda[i+1][j-1]==1)||(tda[i][j-1]==1)){
						b=false;
						break;
					}
				}
				else if(i==m && j==0) {
					if((tda[i-1][j]==1)||(tda[i-1][j-1]==1)||(tda[i][j+1]==1)){
						b=false;
						break;
					}
				}
				else if(i==m &&j==n) {
					if((tda[i-1][j-1]==1)||(tda[i-1][j]==1)||(tda[i][j-1]==1)) {
						b=false;
						break;
					}
				}
				else if(i==0 && j!=0) {
					if((tda[i+1][j]==1)||(tda[i+1][j+1]==1)||(tda[i+1][j-1]==1)||(tda[i][j-1]==1)||(tda[i][j+1]==1)){
						b=false;
						break;
					}
				}
				else if(i!=0 && j==0) {
					if((tda[i+1][j]==1)||(tda[i+1][j+1]==1)||(tda[i][j+1]==1)||(tda[i-1][j]==1)||(tda[i-1][j+1]==1)) {
						b=false;
						break;
					}
				}
				else if(i!=0 && j==n) {
					if((tda[i-1][j]==1)||(tda[i-1][j=1]==1)||(tda[i][j-1]==1)||(tda[i+1][j-1]==1)||(tda[i+1][j]==1)) {
						b=false;
						break;
					}
				}
				else if(i==m && j!=0) {
					if((tda[i][j-1]==1)||(tda[i-1][j-1]==1)||(tda[i-1][j]==1)||(tda[i-1][j+1]==1)||(tda[i][j+1]==1)) {
						b=false;
						break;
					}
				}
				else {
					if((tda[i][j-1]==1)||(tda[i-1][j-1]==1)||(tda[i-1][j]==1)||(tda[i-1][j+1]==1)||(tda[i][j+1]==1)||(tda[i+1][j-1]==1)||(tda[i+1][j]==1)||(tda[i+1][j+1]==1)) {
						b=false;
						break;
						
					}
				}}
			}
		}
		System.out.println(b);
	}
}