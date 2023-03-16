package core_java;

import java.util.Scanner;

public class A2_4_4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks : " );
		int marks = sc.nextInt();
		
		Grade(marks);
	}
	public static void Grade(int marks)
	{
		if(marks>=91)
		{
			System.out.println("your grade is A");
		}else if(marks>=81 && marks<=90)
		{
			System.out.println("your grade is B");
		}else if(marks>=71 && marks<=80)
		{
			System.out.println("your grade is C");
		}else if(marks>=61 && marks<=70)
		{
			System.out.println("your grade is D");
		}else if(marks>=51 && marks<=60)
		{
			System.out.println("your grade is DD");
		}else if(marks<=50)
		{
			System.out.println("you are fail");
		}
	}
	
}