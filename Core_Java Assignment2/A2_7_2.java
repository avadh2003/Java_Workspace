package core_java;

import java.util.HashSet;

public class A2_7_2 
{
	public static void main(String[] args) 
	{
		HashSet<String> name = new HashSet<>();
		
		name.add("Avadh");
		name.add("Meet");
		name.add("Himanshu");
		name.add("Harshil");
		name.add("Raj");
		
		System.out.println("Elements in hashset : " + name);
		System.out.println("Number of elements in hashset : "+ name.size());
	}
}
