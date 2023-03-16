package core_java;


class MyThread extends Thread
{
	public void run()
	{
		int i = 0;
		
		while(i<10)
		{
			System.out.println("Thread1 is running...");
			try 
			{
				sleep(2000);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}
}

class MyThread12 extends Thread
{
	public void run()
	{
		int i=0;
		
		while(i<20)
		{
			System.out.println("Thread2 is running...");
			try
			{
				sleep(2000);
			} catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}
}



public class A2_6_4 
{
	public static void main(String[] args) 
	{
		MyThread t1 = new MyThread();
		MyThread12 t2 = new MyThread12();
		
		t1.start();
		t2.start();
	}
}


