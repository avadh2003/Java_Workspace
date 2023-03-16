package core_java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class A2_7_11 
{
	public static void main(String[] args) 
	{
		HashSet<String> hashset = new HashSet<String>();
		hashset.add("Red");
		hashset.add("White");
		hashset.add("Black");
		hashset.add("Blue");
		hashset.add("Orange");
		
		System.out.println("Original HashSet : " + hashset);
		
		List<String> list = new ArrayList<>(hashset);
		System.out.println("ArrayList : "+ list);
	}
}
