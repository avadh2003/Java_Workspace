package task15_2;

public class ArrayCopy 
{
	public static void main(String[] args) 
	{
		int arr[] = {10,20,30,40,50};
		
		int arr1[] = new int[10];
		
		System.arraycopy(arr, 1, arr1, 3, 4);
		
		for (int i = 0; i < arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
	}
}
