package core_java;

import java.util.HashMap;

public class A2_7_12 
{
	public static void main(String[] args) 
	{
		 HashMap <Integer,String> hashmap = new HashMap <Integer,String> ();
		  hashmap.put(1, "Red");
		  hashmap.put(2, "Green");
		  hashmap.put(3, "Black");
		  hashmap.put(4, "White");
		  hashmap.put(5, "Blue");
		  
		  boolean result = hashmap.isEmpty();
		  System.out.println("Is hashmap empty : " + result);
		  
		  hashmap.clear();
		  result = hashmap.isEmpty();
		  System.out.println("Is hashmap empty : " + result);
	}
}
