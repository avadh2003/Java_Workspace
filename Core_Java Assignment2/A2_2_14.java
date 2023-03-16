package core_java;

import java.util.Scanner;

public class A2_2_14 
{	
	public void M1(int n,char c)
	{
		System.out.println(n +" "+ c);
	}
	public void M2(char c, int n)
	{
		System.out.println(c + " " + n);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
		A2_2_14 s1 = new A2_2_14();
		s1.M1(1, 'A');
		s1.M2('B', 2);
	}
}
