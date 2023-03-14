package task3_3;

import java.util.Vector;

public class Vector1
{
	
	public static void main(String[] args)
	{
		Vector v = new Vector<>(6);
		
		v.addElement("A");
		v.addElement("V");
		v.addElement("A");
		v.addElement("D");
		v.addElement("H");
		v.addElement("A");
		v.addElement("R");
		v.addElement("A");
		v.addElement("B");
		v.addElement("H");
		v.addElement("E");
		v.addElement("S");
		v.addElement("A");
		v.addElement("N");
		v.addElement("I");
		v.addElement("Y");
		v.addElement("A");
		
		System.out.println("Size : " + v.size());
		System.out.println("Capacity : "+ v.capacity());
		
		if(v.contains("A"))
		{
			System.out.println("Available");
		}else
		{
			System.out.println("Not Available");
		}
		
		System.out.println(v.firstElement());
		System.out.println(v.elementAt(15));
		System.out.println(v.lastElement());
		
	}	
}
