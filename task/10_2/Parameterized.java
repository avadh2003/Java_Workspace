package task_10_2;

public class Parameterized 
{
	int id;
	String collage_name;
	
	public Parameterized(int id,String collage_name)
	{
		// TODO Auto-generated constructor stub
		
		this.id = id;
		this.collage_name = collage_name;
	}
	
	void display()
	{
		System.out.println(id+" "+ collage_name);
	}
	
	public static void main(String[] args) {
		
		
		Parameterized a1 =new Parameterized(001,"MARWADI");
		Parameterized a2 =new Parameterized(002,"RK");
		
		a1.display();
		a2.display();
	}
}
