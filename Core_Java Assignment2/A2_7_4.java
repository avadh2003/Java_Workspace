package core_java;

import java.util.HashMap;

public class A2_7_4 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> value = new HashMap<>();
		
		value.put(2001, "  Avadh");
		value.put(2002, "  Meet");
		value.put(2003, "  Himanshu");
		value.put(2004, "  Harshil");
		
		System.out.println("Size of the hashmap : "+ value.size());
	}
}
