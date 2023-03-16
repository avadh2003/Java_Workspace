package core_java;

import java.util.Scanner;

public class A2_2_3 
{
	public static void main(String[] args) 
	{
		char ch;
		System.out.println("Enter any character : ");
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		
		int a=ch;
		System.out.println("ASCII value of "+ch+"is :" + a); 
	}
}
