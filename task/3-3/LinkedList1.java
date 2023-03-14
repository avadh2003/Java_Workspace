package task3_3;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList1
{
	public static void main(String[] args) 
	{
		
		LinkedList<String>list =new LinkedList<>();
		list.add("Android");
		list.add("Java");
		list.addFirst("Ios");
		list.addLast("Php");
		
		
		System.out.println(list);
		
		//Sorting
		Collections.sort(list);
		System.out.println(list);
	}
}
