package task13_2;

class W
{
	void w()
	{
		System.out.println("W is executed");
	}
}

class X extends W
{
	void x()
	{
		System.out.println("X is executed");
	}
}

interface Y
{
	void y();
}

class Z extends X implements Y
{

	public void y() {
		// TODO Auto-generated method stub
		System.out.println("Y is executed");
	}
	
}
public class Hybrid_in 
{

	public static void main(String[] args) 
	{
		Z myz = new Z();
		
		myz.w();
		myz.x();
		myz.y();
	}

}
