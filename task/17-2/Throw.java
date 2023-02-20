package task17_2;

public class Throw 
{
	static void validage(int age)
	{
		if(age>18)
		{
			System.out.println("you can vote");
		}
		else
		{
			System.out.println("you can't vote");
		}
	}
	
	public static void main(String[] args) 
	{
		validage(15);
		validage(20);
	}
}
