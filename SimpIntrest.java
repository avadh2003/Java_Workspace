package prectice;

import java.util.Scanner;

public class SimpIntrest 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("This is program for calculate simple intreast par year at 18%...");
		
		System.out.println("Enter your Income : ");
		long P = sc.nextLong();
		float R = 18;
		int T = 1;
		
		float SI = (T*R*P)/100;
		
		System.out.println("your text value is "+ SI);
		
	}

}
	
