package core_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A2_6_15 
{
	public static void main(String[] args) 
	{
		 List<String> list = new ArrayList<String>();
		  list.add("Red");
		  list.add("Green");
		  list.add("Orange");
		  list.add("White");
		  list.add("Black");
		  System.out.println("Befor suffle : " + list);
		  
		  Collections.shuffle(list);
		  System.out.println("After Suffle : " + list);
	}
}
