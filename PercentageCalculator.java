package prectice;

import java.util.Scanner;

public class PercentageCalculator 
{

	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter your marks (out of 100)");
			
			System.out.println("Gujarati : ");
			int guj = sc.nextInt();
			
			System.out.println("OOP : ");
			int oop = sc.nextInt();
			
			System.out.println("English : ");
			int eng = sc.nextInt();
			
			System.out.println("hindi : ");
			int hin = sc.nextInt();
			
			System.out.println("sanskrit : ");
			int sans = sc.nextInt();
			
			System.out.println("sum of marks : ");
			int sum = (guj+oop+eng+hin+sans);
			System.out.println("your total marks is " + sum);
			
			int per = (sum*100)/500;
			
			System.out.println("your percentage is " + per +"%");
			
			
			
	}
	
	
	
	
}
