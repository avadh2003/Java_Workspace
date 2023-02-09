package prectice;

import java.util.Scanner;

public class Tri_rect_Circ 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1 for area of triangle \n2 for are of rectangle \n 3 for area of circle ");
		
		System.out.println("Enter your choice :");
		int choice = sc.nextInt();
		
		if(choice == 1)
		{
			System.out.println("Enter height : ");
			float h = sc.nextFloat();
			
			System.out.println("Enter base : ");
			float b = sc.nextFloat();
			
			float t_area =  (h * b)/2;
			System.out.println("the area of the triangle is " + t_area);
		}
		if(choice == 2)
		{
			System.out.println("Enter width : ");
			float w = sc.nextFloat();
			
			System.out.println("Enter length :");
			float h1 = sc.nextFloat();
			
			float r_area = (w * h1);
			
			System.out.println("the area of the rectangle is " + r_area);
		}
		if(choice == 3)
		{
			System.out.println("Enter radius : ");
			float r = sc.nextFloat();
			
			float c_area = ( r * r)*22/7;
			System.out.println("the area of the circel is " + c_area);
			
		}
		 
		
		
	}
	
	
}
