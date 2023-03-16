package core_java;

import java.util.Iterator;
import java.util.Scanner;

public class A2_2_2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String str;
		System.out.println("Enter String :");
		str = sc.nextLine();
		
		char ch[] = str.toCharArray();
		int letters = 0,spaces = 0,number = 0,other = 0;
		
		for(int i = 0;i<str.length();i++)
		{
			if(Character.isLetter(ch[i]))
			{
				letters++;
			}else if(Character.isSpaceChar(ch[i]))
			{
				spaces++;
			}else if(Character.isDigit(ch[i]))
			{
				number++;
			}else
			{
				other++;
			}
		}
		System.out.println("String are : " +str);
		System.out.println("letters are : " +letters);
		System.out.println("spaces are : "+spaces);
		System.out.println("number are : "+ number);
		System.out.println("other are : "+ other);
	}
}
