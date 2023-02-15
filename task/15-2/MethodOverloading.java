package task15_2;

public class MethodOverloading 
{
	
	int add(int a, int b)
	{
		return a+b;
	}
	
	int add(int a, int b, int c)
	{
		return a+b+c;
	}
	float add(float c, float d)
	{
		return c+d;
	}
	public static void main(String[] args) 
	{
		MethodOverloading m = new MethodOverloading();
		
		System.out.println(m.add(1, 2));
		System.out.println(m.add(1, 2, 3));
		System.out.println(m.add(1.5f, 1.5f));
	}
}
