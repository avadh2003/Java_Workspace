package core_java;

class MyThread1 extends Thread
{
	public void run()
	{
		int i = 0;
		
		while(i<10)
		{
			System.out.println("Thread1 is running...");
			i++;
		}
	}
}

class MyThread2 extends Thread
{
	public void run()
	{
		int i=0;
		
		while(i<20)
		{
			System.out.println("Thread2 is running...");
			i++;
		}
	}
}



public class A2_6_3 
{
	public static void main(String[] args) 
	{
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		
		t1.start();
		t2.start();
	}
}

