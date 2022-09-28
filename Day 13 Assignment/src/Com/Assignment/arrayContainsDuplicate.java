package Com.Assignment;

public class arrayContainsDuplicate {

	public static Boolean checkDuplicate(int[] arr) {
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr=new int[] {1,2,3,4,9,5,6,7,8};
		System.out.println(checkDuplicate(arr));

	}

}
