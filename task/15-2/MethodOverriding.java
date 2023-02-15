package task15_2;

class Rbi
{
	 float rate()
	{
		return 1;
	}
}

class Cbi extends Rbi
{
	float rate()
	{
		return 4.8f;
	}
}

class Axis extends Rbi
{
	float rate()
	{
		return 5.7f; 
	}
}

public class MethodOverriding 
{
	public static void main(String[] args) 
	{
		
		Rbi r;
		
		r = new Axis();
		System.out.println("intrest rate if axix bank is " + r.rate());
		
		r = new Cbi();
		System.out.println("intrest rate if cbi bank is " + r.rate());
		
		r = new Rbi();
		System.out.println("intrest rate if rbi bank is " + r.rate());
		
	}
}
