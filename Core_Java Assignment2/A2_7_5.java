package core_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A2_7_5 
{
	public static void main(String[] args) 
	{
		List<String> value = new ArrayList<String>();
		
		value.add("Avadh");
		value.add("Meet");
		value.add("Himanshu");
		value.add("Harshil");
		
		System.out.println("List Befor reversing : " + value);
		Collections.reverse(value);
		System.out.println("List After reversing : " + value);
	}
}

