package core_java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class A2_7_1 
{
	public static void main(String[] args) 
	{
		HashSet<String> hashset = new HashSet<>();
		
		hashset.add("Rajkot");
		hashset.add("Ahmedabad");
		hashset.add("Surat");
		hashset.add("Junagadh");
		
		Iterator<String> it = hashset.iterator();
		System.out.println("****HashSet Containt****");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
