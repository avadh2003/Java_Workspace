package task17_2;

import java.io.IOException;

public class Throws1 
{
	class M
	{
		void m() throws IOException
		{
			System.out.println("M is executed");
		}
	}
	
	class N extends M
	{	
		void n() throws IOException
		{
			
		}
	}
	class P extends N
	{
		void p()throws IOException
		{
			
		}
	}
	
	public static void main(String[] args) 
	{
		P p = new P();
		
		try
		{
			p.m();
			p.n();
			p.p();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
}
