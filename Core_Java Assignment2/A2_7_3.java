package core_java;

import java.util.HashMap;
import java.util.Map;

public class A2_7_3 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> value = new HashMap<>();
		
		value.put(2001, "  Avadh");
		value.put(2002, "  Meet");
		value.put(2003, "  Himanshu");
		value.put(2004, "  Harshil");
		
		
		System.out.println(value);
		System.out.println("-------------------------------------------------------------");
		System.out.println(value.get(2001));
		System.out.println("--------------------------------------------------------------");
		for(Map.Entry m: value.entrySet())
		{
			System.out.print(m.getKey());
			System.out.println(m.getValue());
		}
	}
}
