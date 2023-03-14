package task13_3;

class C implements Runnable
{
	public void run()
	{
		for(int i=0; i<=10; i++)
		{
			System.out.println("thread C : " + i);
		}
	}
}

class D implements Runnable
{
	public void run()
	{
		for(int i=0; i<=10; i++)
		{
			System.out.println("thread D : " + i);
		}
	}
}


public class Thread2 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread(new C());
		Thread t2 = new Thread(new D());
		
		t1.start();
		t2.start();
		
		
	}
}
