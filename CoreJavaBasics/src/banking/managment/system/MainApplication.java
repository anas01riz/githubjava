package banking.managment.system;

import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) {
			int choice;
	Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Hotel Iprimed");
		  Menu m = new Menu();
		 

			System.out.println("1.Display Room Details");
			System.out.println("2.Display Room Availability");
			System.out.println("3.Book");
			System.out.println("4.Order Food");
			System.out.println("5.Checkout");
			System.out.println("6.Exit");
		
			System.out.println("ENTER YOUR CHOICE");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:System.out.println("Choose Room Type:");
					
					break;
					
			case 2:System.out.println("Avialable Rooms:");
			
				break;
				
			case 3:System.out.println("Book:");
			   
			       break;
			       
			case 4: m.menu();
			       
			case 5:System.out.println("Checkout");
					break;
					
			case 6:System.out.println("Exit");
					break;
			
			}
		
	}
}			