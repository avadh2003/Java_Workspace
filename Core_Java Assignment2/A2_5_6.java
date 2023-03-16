package core_java;

import java.util.Scanner;

public class A2_5_6 
{
	public static void main(String[] args) 
	{	
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your age : " );
			int age = sc.nextInt();
			  String[] arg = null;
			 age=Integer.parseInt(arg[0]);

              if(age<18)

                    throw new ArithmeticException("Invalid Age Exception");

              else

                    System.out.println("Welcome To The Group Of Votes");

		}
		 catch (Exception e) {
			// TODO: handle exception
			 System.out.println(e);
		}
	}
}
