package core_java;

abstract class Parent
{
	public abstract void Message();
}

class subclass1 extends Parent
{

	@Override
	public void Message() {
		// TODO Auto-generated method stub
		System.out.println("this is firse subclass");
		
	}
	
}

class subclass2 extends Parent
{

	@Override
	public void Message() {
		// TODO Auto-generated method stub
		System.out.println("this is second subclass");
	}
	
}

public class A2_3_7 
{
	public static void main(String[] args) 
	{
		subclass1 c1 = new subclass1();
		subclass2 c2 = new subclass2();
		
		c1.Message();
		c2.Message();
	}
}
