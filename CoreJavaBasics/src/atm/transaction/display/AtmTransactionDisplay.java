package atm.transaction.display;

import java.util.Scanner;

public class AtmTransactionDisplay {

	public static void main(String[] args) {
		int balance=1000,pin,choice,withdraw,deposit;
			String transaction;
			Scanner st=new Scanner(System.in);
		System.out.println("ENTER YOUR SECRET PIN NUMBER:");
		pin=st.nextInt();
		do
		{
			System.out.println("Welcome to ATM Services");
			System.out.println("1.Check Balance");
			System.out.println("2.Withdraw Cash");
			System.out.println("3.Deposit Cash");
			System.out.println("4.Quit");
			
			System.out.println("ENTER YOUR CHOICE");
			choice=st.nextInt();
			switch(choice)
			{
			case 1:System.out.println("Your Balance is :"+balance);
					break;
					
			case 2:System.out.println("Enter your amt for withdrawl:");
				withdraw=st.nextInt();
				if(balance>withdraw)
				{
					balance=balance-withdraw;
					System.out.println("Please Collect Your Cash");
					System.out.println("Your Current Balance is:"+balance);
				}
				else
				{
					System.out.println("Not Enough Balance Available for Withdrawal");
				}
				break;
				
			case 3:System.out.println("Enter your Amount to Deposit:");
			       deposit=st.nextInt();
			       balance=balance+deposit;
			       System.out.println("Your Balance is:"+balance);
			       break;
			       
			case 4:System.out.println("Thank You For Using the ATM");
			       break;
			
			}
			System.out.println("Do you wish to have another Transaction (y/n):");
			transaction=st.next();
			
		}
		while(transaction.equalsIgnoreCase("y"));
		
		System.out.println("Thank You For Using the ATM");
		}

	}