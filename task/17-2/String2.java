package task17_2;

public class String2 
{
	public static void main(String[] args) 
	{
		String s1 = "avadh";
		String s2 = "avadh";
		String s3 = "AVADH";
		String s4 = "meet";
		String s5 = new String("avadh");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		
		System.out.println(s1.compareTo(s5));
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s5);
	}
}
