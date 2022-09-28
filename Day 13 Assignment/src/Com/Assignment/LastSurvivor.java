package Com.Assignment;

import java.util.Scanner;

public class LastSurvivor {
    static int survive(int n,int k){
        if (n==1)return 1;
        return (survive(n-1,k)+k-1)%n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=6;
        int k=2;
        System.out.println(survive(n,k));
    }
}