package core_java;

import java.util.Scanner;

public class A2_5_3 
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 0;
		
		try 
		{
			float ans;
			ans = a/b;
			System.out.println("your answer is : " + ans );
		}
		catch (ArithmeticException e) 
		{
			// TODO: handle exception
			System.out.println("Divided by zero operation cannot possible");
		}
	}
}
