package core_java;

class Member
{
	String name;
	int age;
	long phoneNo;
	String address;
	double salary;
	
		public Member(String name,int age,long phoneNo,String address,double salary) 
		{
			// TODO Auto-generated constructor stub
			this.name = name;
			this.age = age;
			this.phoneNo = phoneNo;
			this.address = address;
			this.salary = salary;
		}
		
		public void printSalary()
		{
			System.out.println("salary : "+ salary);
		}
}



public class A2_3_3 
{
	public static void main(String[] args) 
	{
		Member m = new Member("Avadh", 19, 81, "Rajkot", 80000);
		
		m.printSalary();
	}
}
