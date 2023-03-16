package core_java;

import java.util.ArrayList;
import java.util.List;

public class A2_6_8
{
	public static void main(String[] args) 
	{
		 List<String> list = new ArrayList<String>();
		  list.add("Red");
		  list.add("Green");
		  list.add("Orange");
		  list.add("White");
		  list.add("Black");
		  System.out.println("Befor adding : "+list);
		  
		  list.add(0, "Pink");
		  
		  System.out.println("After adding : " + list);
		  
		  
	}
}
