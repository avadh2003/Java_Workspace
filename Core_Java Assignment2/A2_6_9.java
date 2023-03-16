package core_java;

import java.util.ArrayList;
import java.util.List;

public class A2_6_9 
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
		  
		  System.out.println("third element : "+list.get(2));
		  
		  System.out.println("fifth element : "+list.get(4));
	}
}
