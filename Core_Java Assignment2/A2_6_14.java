package core_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A2_6_14 
{
	public static void main(String[] args) 
	{
		 List<String> List1 = new ArrayList<String>();
		  List1.add("1");
		  List1.add("2");
		  List1.add("3");
		  List1.add("4");
		  System.out.println("List1: " + List1);
		  List<String> List2 = new ArrayList<String>();
		  List2.add("A");
		  List2.add("B");
		  List2.add("C");
		  List2.add("D");
		  System.out.println("List2: " + List2);
		  
		  Collections.copy(List2, List1);
		  System.out.println("List 1: " +List1);
		  System.out.println("List 2: "+ List2);
		  
	}
}
