package core_java;

import java.util.HashSet;

public class A2_6_16 
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
