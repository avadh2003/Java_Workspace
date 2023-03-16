package core_java;

public class A2_2_6 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i<=100; i++)
		{
			if((i%3) == 0)
			{
				System.out.println("number divide by 3 : " + i);
			}
			if((i%5) == 0)
			{
				System.out.println("number divide by 5 : " + i);
			}
		}
	}
}
