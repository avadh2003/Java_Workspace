package core_java;

class ComplexNumber
{
	double real;
	double imaginary;
	
	public ComplexNumber(double real,double imaginary)
	{
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public ComplexNumber Sum(ComplexNumber other)
	{
		double r = this.real + other.real;
		double i = this.imaginary + other.imaginary ;
		return new ComplexNumber(r, i);
	}
	public ComplexNumber Difference(ComplexNumber other)
	{
		double r = this.real - other.real;
		double i = this.imaginary - other.imaginary;
		return new ComplexNumber(r, i);
	}
	
	public double getReal()
	{
		return real;
	}
	public double getImaginary()
	{
		return imaginary;
	}
	
	public String toString()
	{
		return real+" + "+ imaginary +"i";
	}
}


public class A2_3_6 
{
	public static void main(String[] args) 
	{
		ComplexNumber c1 = new ComplexNumber(2, 4); 
		ComplexNumber c2 = new ComplexNumber(3, 5);
		ComplexNumber sum = c1.Sum(c2); 
		ComplexNumber difference = c1.Difference(c2);
		System.out.println("first complex number: " + c1); 
		System.out.println("second complex number: " + c2);
		System.out.println("sum of two complex numbers: " + sum); 
		System.out.println("difference of two complex numbers: " + difference);

		
	}
}












