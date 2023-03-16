package core_java;

abstract class Mark
{
	public abstract float getPercentage();
}

class P extends Mark
{
	float sub1,sub2,sub3;
	float per = 0;
	
	P(float a,float b,float c)
	{
		sub1 = a;
		sub2 = b;
		sub3 = c;
	}

	@Override
	public float getPercentage() {
		// TODO Auto-generated method stub
		per = (sub1 + sub2 + sub3 )/300*100;
		return per;
	}
	
}

class Q extends Mark
{
	float sub1,sub2,sub3,sub4;
	float per = 0;
	
	Q(float a, float b, float c, float d)
	{
		sub1 = a;
		sub2 = b;
		sub3 = c;
		sub4 = d;
	}

	@Override
	public float getPercentage() {
		// TODO Auto-generated method stub
		per = (sub1 + sub2 + sub3 + sub4)/400*100;
		return per;
	}
	
}

public class A2_4_1 
{
	public static void main(String[] args) 
	{
		P a = new P(70f,70f,70f);
		Q b = new Q(60f,60f,60f,60f);
	
		System.out.println("percentage of Student A : " + a.getPercentage());
		System.out.println("percentage of Student B : " + b.getPercentage());		
	}
}
