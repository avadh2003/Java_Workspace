package core_java;

public class A2_5_2 
{
	public static void main(String[] args) 
	{
		try
		{
		 int[] number = {1, 2, 3};
	      System.out.println(number[10]);
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			// TODO: handle exception
			System.out.println("Something wents to wrong");
			System.out.println(e);
		}
//		
		try 
		{
			int ans = 10/0;
		} catch (ArithmeticException e) 
		{
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
