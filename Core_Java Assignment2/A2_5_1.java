package core_java;

class Shape1
{
	public void Print()
	{
		System.out.println("This is this shape.");
	}
}

class Rectangle1 extends Shape1
{
	public void RP()
	{
		System.out.println("This is Rectangular shape");
	}
}
class Circle1 extends Shape1
{
	public void CP()
	{
		System.out.println("This is Circular shape");
	}
}

class Square1 extends Rectangle1
{
	public void SP()
	{
		System.out.println("Square is Rectangle");
	}
} 

public class A2_5_1 
{
	public static void main(String[] args) 
	{
		Square1 s = new Square1();
		s.SP();
		s.RP();
	}	
}
