package core_java;

public class MaxNum
{
	public static void main(String[] args) 
	{
		int a = 62;
		int b = 42;
		int c = 6;
		
		if(a >= b && a >= c)
		{
			System.out.println("the greatest number is "+ a);
		}
		else if(b >= a && b >= c )
		{
			System.out.println("the greatest number is "+ b);
		}else
		{
			System.out.println("the greatest number is "+ c);
		}
		
		
	}
}
