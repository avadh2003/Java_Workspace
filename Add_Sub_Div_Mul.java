package prectice;

import java.util.Scanner;

public class Add_Sub_Div_Mul
{

	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for Addition \nPress 2 for Substraction \n"
				+ "Press 3 for Multiplication \nPress 4 for Division");
		System.out.println("        Enter your choice : ");
		int num = sc.nextInt();
		
		System.out.println("Enter 1st number : ");
			int a = sc.nextInt();
			System.out.println("Enter 2nd number : ");
			int b = sc.nextInt();
		
		switch(num)
		{
		 	case 1: int c =a + b;
		 	System.out.println("addition is " +c);
		 			 
		 	case 2 :int d = a - b;
		 	System.out.println("Substraction is " + d);
		 	
		 	case 3 : int e = a * b;
		 	System.out.println("Multiplication is " + e);
		 	
		 	case 4 : int f = a / b;
		 	System.out.println("Division is " + f);
		 	
		
		
		
		}
		
		
		
		
	}
	
	
	
	
}
