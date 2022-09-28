package Com.Assignment;

public class RotateMatrix {

	public static void main(String[] args) {
		int[][] arr=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr1=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

		int k=2;
	for(int i=0;i<3;i++)
	{
		
		for(int j=0;j<3;j++)
		{
			arr1[i][j]=arr[j][k];
			
		}
		k--;
		
	}
	System.out.println("---------------------------------");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(arr1[i][j]);
		}
		System.out.println();
	}
	}


}
