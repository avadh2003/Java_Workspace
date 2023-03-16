package core_java;

public class A2_3_1 
{
	public void Area(int l, int b)
	{		
		float ans = l*b;
		System.out.println("Area of rectangle  : " + ans);
	}
	public void Area(int s)
	{
		float ans = s*s;
		System.out.println("Area of square : " + ans);
	}
	
	public static void main(String[] args) 
	{	
		A2_3_1 area = new A2_3_1();
		area.Area(2);
		area.Area(2, 3);
	}
}

