package prectice;

import java.util.Scanner;

public class AreaOfTringle 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("This program is for find the area of tringle...");
		
		System.out.println("Enter height : ");
		float hei = sc.nextFloat();
		
		System.out.println("Enter base : ");
		float base = sc.nextFloat();
		
		float area = (hei*base)/2;
		
		System.out.println("the area of the tringle is " + area);
		
		
	}
	
	
	

}
