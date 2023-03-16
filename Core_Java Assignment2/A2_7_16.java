package core_java;

import java.util.ArrayList;

public class A2_7_16 
{
	public static void main(String[] args) 
	{
		 ArrayList<String> c1= new ArrayList<String>();
         c1.add("Red");
         c1.add("White");
         c1.add("Green");
         c1.add("Black");
         c1.add("Pink");
         System.out.println("First hashset contain : " + c1);

         ArrayList<String> c2= new ArrayList<String>();
         c2.add("Red");
         c2.add("Green");
         c2.add("Black");
         System.out.println("Second hashset containt : "+ c2);
         
         c1.retainAll(c2);
         System.out.println("hashset containt : "+c1);
	}
}
