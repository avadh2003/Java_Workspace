package task3_3;


import java.util.ArrayList;
import java.util.HashSet;

public class HashSet1 
{
	public static void main(String[] args)
	{
		HashSet<Integer>arr =new HashSet<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(1);
		arr.add(2);
		arr.add(5);
		
		System.out.println(arr);
		
	}
}