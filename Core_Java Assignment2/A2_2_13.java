package core_java;

public class A2_2_13 
{
	static final int N0_OF_CHAR = 256;
	
	static char MostFreq2nd(String str)
	{
		int [] ctr = new int [N0_OF_CHAR];
		int i;
		for(i=0;i<str.length();i++)
			 (ctr[str.charAt(i)]) ++;
		
		int ctr_first = 0, ctr_second = 0;
		
		return 0;
	}
	
	
	public static void main(String[] args) 
	{
		String str = "success";
	}
}
