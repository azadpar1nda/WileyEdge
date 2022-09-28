package Assignment3;
import java.util.Scanner;
public class Circle {
	public double calculateArea(double radius){
		double area=3.14*radius*radius;
		return area;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius");
		double r=sc.nextDouble();
		Circle c=new Circle();
		double area=c.calculateArea(r);
		System.out.println("Area Of Circle is : "+area);
		sc.close();
	}

}
