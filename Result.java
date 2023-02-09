package prectice;

import java.util.Scanner;

public class Result 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your subject marks (out of 100)");
		
		System.out.println("JAVA :");
		int java = sc.nextInt();
		
		System.out.println("PYTHON :");
		int python = sc.nextInt();
		
		System.out.println("PHP :"); 
		int php = sc.nextInt();
		
		System.out.println("C :");
		int c = sc.nextInt();
		
		System.out.println("C++ :");
		int c1 = sc.nextInt();

		int sum = (java+python+php+c+c1);
		System.out.println("your total maeks is "+ sum);
		
		int per = (sum * 100)/500;
		System.out.println("your percentage is " + per + "%");
		
		if(per > 75)
		{
			System.out.println("Distinction");
		}else if(per >60 && per <= 75)
		{
			System.out.println("first class");
		}else if(per >50 && per <= 60){
			System.out.println("second class");
		}else if(per >35 && per <= 50)
		{
			System.out.println("pass class");
		}else
		{
			System.out.println("Fail");
		}
		}
	
	

}
