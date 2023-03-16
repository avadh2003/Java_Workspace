package core_java;

import java.util.ArrayList;
import java.util.List;

public class A2_6_10 
{
	public static void main(String[] args) 
	{
		 List<String> list = new ArrayList<String>();
		  list.add("Red");
		  list.add("Green");
		  list.add("Orange");
		  list.add("White");
		  list.add("Black");
		  System.out.println("Befor update : "+list);
		  
		  list.set(1, "light green");
		  
		  System.out.println("After Update : "+ list);
	}
}
