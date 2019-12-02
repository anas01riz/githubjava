package banking.managment.system;

import java.util.Scanner;

import hm.RoomAlreadyBookedException;

public class MainApplication {

	public static void main(String[] args) {
			int choice;
	Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Hotel Iprimed");
		  Menu m = new Menu();
		  RoomAvailibilty ra = new RoomAvailibilty();

		  System.out.println("Choose room type :\r\n" + 
					"1. Luxury Double Room \r\n" + 
					"2.Deluxe Double Room \r\n" + 
					"3. Luxury Single Room \r\n" + 
					"4.Deluxe Single Room\r\n" + 
					"");
		
			System.out.println("ENTER YOUR CHOICE");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:System.out.println();
				try {
					ra.roomType();
				} catch (RoomAlreadyBookedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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