package core_java;

import java.util.ArrayList;

public class A2_7_15 
{
	public static void main(String[] args) 
	{
		  ArrayList <String> c1 = new ArrayList <String> ();
		  c1.add("Red");
		  c1.add("Green");
		  c1.add("Black");
		  c1.add("White");
		  c1.add("Pink");
		  System.out.println("Original array list: " + c1);
		  System.out.println("Print using index of an element: ");
		  
		  int element = c1.size();
		  for(int i = 0; i<element; i++)
		  {
			  System.out.println(c1.get(i));
		  }
	}
}