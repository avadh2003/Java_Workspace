package prectice;

import java.util.Scanner;

public class Positive_Negative 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("check the number is positive or negative");
		
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		
		if(num >= 0)
		{
			System.out.println("the number is  positive");
		}
		else
		{
			System.out.println("the number is negative");
		}
	}
	
	
	
	
}
