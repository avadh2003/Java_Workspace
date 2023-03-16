package core_java;

abstract class Bank
{
	public abstract void getBalance();
}

class BankA extends Bank
{

	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("Deposit of A : $100");
		
	}
	
}

class BankB extends Bank
{

	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("Deposit of B : $150");
	}
	
}

class BankC extends Bank
{

	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("Deposit of C : $200");
	}
	
}


public class A2_3_8 
{
	public static void main(String[] args) 
	{
		BankA ba = new BankA();
		BankB bb = new BankB();
		BankC bc = new BankC();
		
		ba.getBalance();
		bb.getBalance();
		bc.getBalance();
	}
}
