package prectice;

import java.util.Scanner;

public class AreaOfCircle 
{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("This program is for find the area of circle...");
		
		System.out.println("Enter radius of circle : ");
		float rad = sc.nextFloat();
		
		float area = 3.14f*rad*rad;
	
		System.out.println("area of circle is " + area);
		
		
	}
	
	
	
}
