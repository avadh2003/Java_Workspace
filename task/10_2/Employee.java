package task_10_2;

import java.util.Scanner;

public class Employee 
{
		static int id = 0;
		static String name = " ";
		
	public static void main(String[] args) 
	{
			Employee e1 = new Employee();
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter employee id : ");
			id = sc.nextInt();
			System.out.println("Enter emplpyee name :");
			name = sc.next();
			
			e1.id = id;
			e1.name = name;
			
			System.out.println(e1.id + " " + e1.name);
	}	
}
