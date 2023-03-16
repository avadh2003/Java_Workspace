package core_java;

import java.util.Scanner;

public class A2_4_2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Emter number : " );
		int num = sc.nextInt();
		
		factorial(num);
	}
	
	static void factorial(int num)
	{
		 int f = 1;
		 
		 for(int i=1;i<=num;i++)
		 {
			 f=f*i;
		 }
		 System.out.println("factorial of "+num + " is "+f);
	}
}
