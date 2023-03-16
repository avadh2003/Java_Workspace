package core_java;

public class A2_2_8 
{
	public static void main(String[] args) 
	{
		String str1 = "Avadh";
		String str2 = " Bhesaniya";
	
		System.out.println(str1.concat(str2));
		System.out.println( str1 + str2);
		
		StringBuffer s1 = new StringBuffer("tops");
		String s2 = " technologies";
		
		s1.append(s2);
		System.out.println(s1);
	
	} 
	
}
