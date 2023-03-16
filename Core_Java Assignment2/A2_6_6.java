package core_java;

public class A2_6_6 extends Thread
{
	
	public A2_6_6(String name) 
	{	
		// TODO Auto-generated constructor stub
			super(name);
	}
	
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println(getName() + " is daemon thread");
		}
		else
		{
			System.out.println(getName() + " is user thread");
		}
	}
	
	public static void main(String[] args) 
	{
		
		 A2_6_6 t1 = new A2_6_6("t1");
		 A2_6_6 t2 = new A2_6_6("t2");
	     A2_6_6 t3 = new A2_6_6("t3");
	     A2_6_6 t4 = new A2_6_6("t4");
	     
	      
		  t1.setDaemon(true);
	      t1.start();
	        
	        t2.start();
	        
	        t3.setDaemon(true);
	        t3.start();      
	        
	        t4.setDaemon(true);
	        t4.start();
	}
}
