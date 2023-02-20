package task17_2;

public class StringDeceleration 
{
	public static void main(String[] args) 
	{
		String s1 = "avadh";
		
		String s2 = new String("avadh");
		
		char ch[] = {'a','v','a','d','h'};
		String s3 = new String(ch);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
