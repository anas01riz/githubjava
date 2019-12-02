package banking.managment.system;

import java.util.Scanner;

public class Menu implements Food{
	Scanner sc = new Scanner(System.in);
	 public int menu()
	 {
		System.out.println("==========\r\n" + 
				"Menu: \r\n" + 
				"==========\r\n" + 
				"1. Sandwich Rs.50\r\n" + 
				"2. Pasta Rs.60\r\n" + 
				"3. Noodles Rs.70\r\n" + 
				"4. Coke Rs.30\r\n" + 
				"");
		System.out.println("Enter your choice:\r\n " );
		int menu=sc.nextInt();
		System.out.println("***************Enjoy your meals***************");
		return menu;
	}
	

}
