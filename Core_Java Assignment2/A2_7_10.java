package core_java;

import java.util.HashSet;

public class A2_7_10 
{
	public static void main(String[] args) 
	{
		 HashSet<String> color = new HashSet<String>();
		   
		          color.add("Red");
		          color.add("Green");
		          color.add("Black");
		          color.add("White");
		          color.add("Pink");
		          color.add("Yellow");
		      System.out.println("Original Hash Set: " + color);
   		      
		      String[]array = new String[color.size()];
		      color.toArray(array);
		      System.out.println("Array elements : ");
		      for(String e: array)
		      {
		    	  System.out.println(e);
		      }
	}

}
