package core_java;

import java.util.ArrayList;
import java.util.List;

public class A2_7_6 
{
	public static void main(String[] args) 
	{
		List<String> colorList = new ArrayList<String>();
		
		colorList.add("red");
		colorList.add("Black");
		colorList.add("White");
		colorList.add("Pink");
		colorList.add("Yellow");
		
		System.out.println("Original color list : " + colorList);
		List<String> Sub_colorList =colorList.subList(0, 3);
		System.out.println("Sub color list : "+ Sub_colorList);
		
		
	}
}
