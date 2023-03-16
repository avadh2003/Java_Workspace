package core_java;

import java.util.ArrayList;
import java.util.List;

public class A2_6_12 
{
	public static void main(String[] args) 
	{
		 List<String> list = new ArrayList<String>();
		  list.add("Red");
		  list.add("Green");
		  list.add("Orange");
		  list.add("White");
		  list.add("Black");
		  
		  if(list.contains("Orange"))
		  {
			  System.out.println("color found...");
		  }else
		  {
			  System.out.println("color not found");
		  }
	}
}
