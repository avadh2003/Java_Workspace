package task13_2;

class C
{
	void c()
	{
		System.out.println("C is executed");
	}
}

class D extends C
{
	void d()
	{
		System.out.println("D is executed");
	}
}
class E extends D

{
	void e()
	{
		System.out.println("E is executed");
	}
}



public class Multilevel_in {
	
	public static void main(String[] args) 
	{
		E mye = new E();
		
		mye.e();
		mye.d();
		mye.c();
		
	}

}
