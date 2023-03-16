package core_java;

public class A2_6_5 extends Thread
{
	 public void run() 
	 {
		 int i = 0;
		 while(i<10)
		 {
			 System.out.println("Thread 1" + i);
		 }
  }

  public static void main(String[] args)
  {
      A2_6_5 obj=new A2_6_5();
      
      Thread thread1=new Thread("Thread-1");
      
      thread1.start();
      thread1.start();	
  }
}


