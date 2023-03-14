package task3_3;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class ArrayListEx 
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
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("HP");
		list1.add("SAMSUNG");
		list1.add("APPLE");
		System.out.println(list1);
		
		list1.set(0, "ACER");
		System.out.println(list1);
		
		list1.add(1, "HP");
		System.out.println(list1);
		
		ArrayList<String> list3 = new ArrayList<String>();
		
		list3.add("HP");
		list3.add("TOSIBA");
		
		
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(2);
		list2.add(3);
		list2.add(5);
		System.out.println(list2);
		
		list2.set(1,1);
		System.out.println(list2);
		
		list2.add(0, 2);
		System.out.println(list2);
		
//		list1.remove("APPLE");
//		list2.removeAll(list2);
		System.out.println(list1);
		list1.removeAll(list3);
		System.out.println(list1);
		
		
		//loop
		int i = 0;
		
		for( ;i<list2.size() ; i++);
		{
			
			System.out.println(list2.get(i));
		}
//		System.out.println();
	}
}
