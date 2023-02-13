package task13_2;

class Dad
{
	void dad()
	{
		System.out.println("this is dad");
	}
}

class Son1 extends Dad
{
	void son1()
	{
		System.out.println("this is 1st son");
	}
}

class Son2 extends Dad
{
	void son2()
	{
		System.out.println("this is 2nd son");
	}
	
}
public class Hierarchical_in 
{
	public static void main(String[] args) 
	{
		Son1 s1 = new Son1();
		Son2 s2 = new Son2();
		
		s1.dad();
		s1.son1();
		s2.dad();
		s2.son2();
		
		

	}
}
