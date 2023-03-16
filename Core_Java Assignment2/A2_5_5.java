package core_java;

import java.util.Scanner;

public class A2_5_5
{
	public static void main(String[] args) 
	{	
		try 
		{
			int a,b,c;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1st number : ");
			 a = sc.nextInt();
		
			System.out.println("Enter 2nd number : ");
			b = sc.nextInt();

			c = a/b;
			System.out.println("your answer is : " + c );
		}
		catch (ArithmeticException e) 
		{
			// TODO: handle exception
			System.out.println("Divided by zero operation cannot possible");
			System.out.println(e.getMessage());
			System.out.println(e);
		}
	}
}

