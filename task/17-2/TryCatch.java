package task17_2;

public class TryCatch 
{
	public static void main(String[] args) 
	{
		try
		{
			float a = 10.0f/0;
			
			System.out.println(a);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("success...");
		}
	}
}
