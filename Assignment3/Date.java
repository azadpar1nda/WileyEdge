package Assignment3;
import java.util.Scanner;
public class Date {
	int dd,mm,yyyy;
	public Date(int dd,int mm, int yyyy) {
		this.dd=dd;
		this.mm=mm;
		this.yyyy=yyyy;
	}
	public void displayDate() {
		System.out.println(dd+"/"+mm+"/"+yyyy);
	}
	public boolean checkDate() {
		if(dd>31) {
			System.out.println("Enter valid date");
			return false;
		}
		if(mm>12) {
			System.out.println("Enter valid date");
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Date");
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yyyy=sc.nextInt();
		sc.close();
		Date d=new Date(dd,mm,yyyy);
		boolean check=d.checkDate();
		if(check)
			d.displayDate();
	}

}
