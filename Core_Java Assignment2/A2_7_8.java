package core_java;

import java.util.ArrayList;
import java.util.Collections;

public class A2_7_8 
{
	public static void main(String[] args) 
	{
		 ArrayList<String> c1= new ArrayList<String>();
         c1.add("Red");
         c1.add("Green");
         c1.add("Black");
         c1.add("White");
         c1.add("Pink");

         System.out.println("Array list before Swap:");
         
         for(String a:c1)
         {
        	 System.out.println(a);
         }
         
         Collections.swap(c1, 0, 3);
         System.out.println("Array list after Swap:");
         for(String b:c1)
         {
        	 System.out.println(b);
         }
	}	
}
