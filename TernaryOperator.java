package prectice;

public class TernaryOperator 
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 100;
		int c = 15;
		// 1st method
//		int max = (a > b) ? a : b;
//		int max1 = (max > c) ? max : c;
		
		
		//2nd methid
		int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		
		System.out.println("the max number is " + max);
	}
	
	
}
