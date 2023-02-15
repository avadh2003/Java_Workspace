package task15_2;

class Name
{
	String name = "Avadh";
}

class Name1 extends Name
{
	String name = "Meet";
	
	void display()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
}

public class Super 
{
	public static void main(String[] args) 
	{
		Name1 n = new Name1();
		n.display();
	}
}
