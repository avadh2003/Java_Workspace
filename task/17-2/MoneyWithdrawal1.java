package general;

import java.util.Scanner;

public class MoneyWithdrawal1
{
	public static void main(String[] args) 
	{
		int balance = 4000;
		int withdraw = 0;
		int deposit = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) 
		{
			System.out.println("Automated Teller Machine");
			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for deposit");
			System.out.println("Choose 3 for check banalce");
			System.out.println("Choose 4 for exit");
			
			int n = sc.nextInt();
		
			switch (n)
			{
				case 1:
					System.out.println("Enter money to be withdraw");
					withdraw = sc.nextInt();
					if(balance >= withdraw)
					{
						balance  = balance - withdraw;
						System.out.println("please collect your "+ withdraw + " rupee");
						System.out.println("your balance after withdraw : " + balance + " rupee" );
					}
					else
					{
						int add_money = withdraw - balance;
						System.out.println("Insufficient balance...\n you want to deposit " + add_money + " rupee to withdraw " + withdraw + " rupee");
					}
					System.out.println(" ");
				break;
				
				case 2:
					System.out.println("Enter money to be deposited");
					deposit  =  sc.nextInt();
					balance = balance + deposit;
					System.out.println("Your money is Successfully deposit");
					System.out.println("your balance after deposit : " + balance +" rupee" );
					System.out.println(" ");
					break;
					
				case 3: 
					System.out.println("your current balance : " +balance + " rupee");
					System.out.println(" ");
					break;
					
				case 4: 
					System.exit(0);
			}
		}
	}
}

