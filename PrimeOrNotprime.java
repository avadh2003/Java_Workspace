package prectice;

import java.util.Scanner;

public class PrimeOrNotprime 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("check the number is prime or not prime...\n Enter number : ");
		int number = sc.nextInt();
		
	/*	if(isPrime(number))
		{
			System.out.println("This number is prime number...");
		}else
		{
			System.out.println("This number is not prime number...");
		}	
	}
	static boolean isPrime(int num)
	{
		if(num<=1)
		{
			return false;
		}
		for(int i=2; i<=num/2;i++)
		{
			if((num%i)==0)
			{
				return false;
			}
		}
		return true;
		*/
		
		int count = 0;
		for(int i = 1; i <= number ; i++)
		{
			if((number % i) == 0)
				count++;
		}
		
		if(count == 2)
		{
			System.out.println("this number is prime number");
		}else
		{
			System.out.println("this number is not prime number");
		}
		
		
	}
	
	
}