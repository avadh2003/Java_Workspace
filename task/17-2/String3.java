package task17_2;

public class String3 
{	
	public static void main(String[] args) 
	{
		
		String s1 = "avadh";
		String s2 = "  avadh  ";
		String s3 = "AVADH";
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s2.trim());
		
		System.out.println(s1.startsWith("av"));
		System.out.println(s1.endsWith("h"));
		
		System.out.println(s2.endsWith("h"));
		System.out.println(s2.startsWith("a"));
		
		System.out.println(s1.toUpperCase());
		System.out.println(s3.toLowerCase());
		
	}
}
