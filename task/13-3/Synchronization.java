package task13_3;

class Sender
{
	public void send(String msg)
	{
		System.out.println("Sending " + msg);
		try 
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e) 
		{	
			e.printStackTrace();
		}
		System.out.println( msg + " Sent" );
	}
}

class ThreadSend extends Thread
{
	Sender sender;
	String msg;
	
	public ThreadSend(Sender sender, String msg) 
	{
		
		this.sender= sender;
		this.msg = msg;
	}
	
	public void run()
	{
		synchronized (sender)
		{
			sender.send(msg);
		}
	}
}


public class Synchronization 
{
	public static void main(String[] args) 
	{
		Sender sender =new Sender();
		ThreadSend t1 =new ThreadSend(sender, "Hii");
		ThreadSend t2 =new ThreadSend(sender, "Bye");
		
		t1.start();
		t2.start();
		
	}
}
