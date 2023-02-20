package task17_2;

public class String5 
{
	public static void main(String[] args) 
	{
		StringBuffer s1 = new StringBuffer("Hello");
		StringBuffer s2 = new StringBuffer("Hello");
		StringBuffer s3 = new StringBuffer("Hello");
		StringBuffer s4 = new StringBuffer("Hello");
		
		s1.insert(0, 'A');
		System.out.println(s1);
		
		s2.delete(0, 3);
		System.out.println(s2);
		
		s3.replace(0, 2, "java");
		System.out.println(s3);
		
		s4.reverse();
		System.out.println(s4);
		
		
	}
}
