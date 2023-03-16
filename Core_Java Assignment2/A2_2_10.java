package core_java;

import java.util.Scanner;

public class A2_2_10 
{
	public static void main(String[] args) 
	{
//		String s1 = "Java Excercises";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String s1 = sc.nextLine();
		
		System.out.println(s1.endsWith("se"));
		System.out.println(s1.endsWith("es"));
	}
}
