package core_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A2_6_13 
{
	public static void main(String[] args) 
	{
		 List<String> list = new ArrayList<String>();
		  list.add("Red");
		  list.add("Green");
		  list.add("Orange");
		  list.add("White");
		  list.add("Black");
		  
		  Collections.sort(list);
		  System.out.println(list);
	}

}
