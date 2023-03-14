package task3_3;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2
{
	public static void main(String[] args)
	{
		ArrayList<Integer>arr =new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(1);
		
		System.out.println(arr);
		
		//sorting
		
		Collections.sort(arr);
		System.out.println(arr);
		
		
	}
}
