package Assignment3;

public class Fibo {
	public int printFibo(int n) {
		if(n<=1)
			return n;
		return printFibo(n-1)+printFibo(n-2); 
		
	}
	public static void main(String[] args) {
		Fibo f=new Fibo();
		for(int i=1;i<10;i++)
		{
			System.out.println(f.printFibo(i));
		}
		

	}

}
