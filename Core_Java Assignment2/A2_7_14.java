package core_java;

import java.util.ArrayList;

public class A2_7_14 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> number = new ArrayList<>();
		
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		number.add(6);
		System.out.println("Original Array list : " + number);
		
		
		int new_number = 11;
		number.set(1, new_number);	
		System.out.println(number);
		
		 int num=number.size();
		  System.out.println("Replace second element with '11'."); 
		  for(int i=0;i<num;i++)
		  System.out.println(number.get(i));
		
		
	}
}
