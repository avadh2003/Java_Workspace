package core_java;

import java.util.Scanner;

public class Leap_year 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter year : ");
		int year = sc.nextInt();
		
		boolean  isLeapYear;
		
		isLeapYear = (year%4 == 0 ) && (year%100 != 0 || (year%400 == 0));
		
		if(isLeapYear)
		{
			System.out.println(year + " is leap year");
		}else
		{
			System.out.println(year + " is not leap year");
		}
		
		
	}	
	
	
}
