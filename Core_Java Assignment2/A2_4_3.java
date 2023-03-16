package core_java;

abstract class Shape
{
	public abstract void RectangleArea(float length,float breadth);
	public abstract void SquareArea(float size);
	public abstract void CircleArea(float radius);
}

class Area extends Shape
{

	@Override
	public void RectangleArea(float length, float breadth) 
	{
		// TODO Auto-generated method stub
		float ans = length*breadth;
		System.out.println("Area of Rectangle : " + ans);
	}

	@Override
	public void SquareArea(float size) 
	{
		// TODO Auto-generated method stub
		float ans = size*size;
		System.out.println("Area of Square : " + ans);
	}

	@Override
	public void CircleArea(float radius) 
	{
		// TODO Auto-generated method stub
		float ans = 3.14f*radius*radius;
		System.out.println("Area of Circle : " + ans);
	}
}

public class A2_4_3 
{
	public static void main(String[] args) 
	{
		Area a = new Area();
		a.RectangleArea(2, 2);
		a.SquareArea(2);
		a.CircleArea(2);
	}
}
