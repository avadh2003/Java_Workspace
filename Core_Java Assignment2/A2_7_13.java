package core_java;

import java.util.ArrayList;

public class A2_7_13 
{
	public static void main(String[] args) 
	{
		  ArrayList<String> c1= new ArrayList<String>(3);
          c1.add("Red");
          c1.add("Green");
          c1.add("Black");
          System.out.println("Original Array Listt : " + c1);
          
          c1.ensureCapacity(5);
          
          c1.add("Pink");
          c1.add("Yellow");
          System.out.println("New array list: " + c1);
	}
}
