package task13_3;


class A extends Thread
{
	public void run()
	{
		int i;
		for(i=0; i<=10; i++)
		{
			System.out.println("thread A : " + i);
		}
	}
}

class B extends Thread
{
	public void run()
	{
		int i;
		for(i=0; i<=10; i++)
		{
			System.out.println("thread B : " + i);
		}
	}
}


	public class Thread1 
	{
	
		public static void main(String[] args) 
		{
			A a = new A();
			B b = new B();
			
			a.start();
			b.start();
		}
	
	}
