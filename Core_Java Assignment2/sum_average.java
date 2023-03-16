package core_java;

import java.util.Scanner;

public class sum_average 
{
		public static void main(String[] args) 
		{
			int sum = 0;
			int k;
			float avg;
			int i;
			Scanner sc = new Scanner(System.in);
			
		
			for(i =1 ; i<=5; i++)
			{ 
				System.out.println("Enter number : ");
				k = sc.nextInt();
				sum = sum+k;
			}
			System.out.println("sum is "+sum);
			avg = sum/5;
			System.out.println("avg is "+avg);	
		}
}
