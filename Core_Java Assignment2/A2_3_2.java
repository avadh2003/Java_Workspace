package core_java;

class A
{
	void parent()
	{
		System.out.println("This is parent class");
	}
}

class B extends A
{
	void child()
	{
		System.out.println("This is child class");
		super.parent();
	}
}


public class A2_3_2 
{
	public static void main(String[] args) 
	{
		A a = new A();
		B b = new B();
		
//		a.parent();
		b.child();
	}
}
