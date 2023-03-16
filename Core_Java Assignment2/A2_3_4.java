package core_java;

class Rectangle
{
		int length,breadth;
	
		public Rectangle(int l, int b) 
		{
			length = l;
			breadth = b;
		}
		
		public void PrintArea()
		{
			System.out.println(length*breadth);
		}
		
		void print_perimeter()
		{
			System.out.println(2*(length+breadth));
		}
}

class Square extends Rectangle
{
	public Square(int s)
	{
		super(s,s);
	}
}

public class A2_3_4 
{

	public static void main(String[] args) 
	{
		Rectangle r = new Rectangle(4, 5);
		Square s = new Square (4);
		 r.PrintArea();
		 r.print_perimeter();
		 s.PrintArea();
		 s.print_perimeter();
	}
}
