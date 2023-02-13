package task13_2;
class A
{
	void a()
	{
		System.out.println("A is executed");
	}
}
class B extends A
{
	void b()
	{
		System.out.println("B is executed");
	}
}

public class Single_in 
{	
	public static void main(String[] args) 
	{
		B myb = new B();
		myb.b();
		myb.a();
	}

}
