package core_java;


class A2 implements Runnable
{

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		for(int i = 0;i<=10;i++)
		{
			System.out.println("Thread A:" + i);
		}
	}
	
}

class B2 implements Runnable
{
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		for(int i = 0;i<=10;i++)
		{
			System.out.println("Thread B:" + i);
		}
	}
}

public class A2_6_2 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread(new A2());
		Thread t2 = new Thread(new B2());
		
		t1.start();
		t2.start();
	}
}
