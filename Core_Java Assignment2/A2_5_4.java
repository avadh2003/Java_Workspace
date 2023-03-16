package core_java;

public class A2_5_4 
{
	public static void main(String[] args) 
	{
		try 
		{
			int number[] = new int[10];
//			number[11] = 30/1;
			number[9] = 30/0;
		} catch (ArithmeticException e) 
		{
			// TODO: handle exception
			System.out.println("Zero can't divide any other number");
		}catch (ArrayIndexOutOfBoundsException e)
		{
			// TODO: handle exception
			System.out.println("Index out of size of the array");
		}
	}
}
	