package task15_2;

final class A
{
	void name()
	{
		System.out.println("Avadh");
	}
}

class B  
//--> final class can't extends
{
	void name1()
	{
		System.out.println("Meet");
	}
}


public class Final1 
{
	public static void main(String[] args) 
	{
		System.out.println("final class can't extends");
			
	}
}
