package task13_2;

interface J
{
	void j();
}

interface K
{
	void k();
}

class L implements J,K
{

	public void k() {
		// TODO Auto-generated method stub
		System.out.println("K is executed");
	}

	public void j() {
		// TODO Auto-generated method stub
		System.out.println("J is executed");
	}
	
}


public class Multiple_in 
{
	public static void main(String[] args) 
	{
		L myl = new L();

		myl.j();
		myl.k();
	}
}
