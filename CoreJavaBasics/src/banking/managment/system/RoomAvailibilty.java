package banking.managment.system;

import java.util.Scanner;

import hm.RoomAlreadyBookedException;

public class RoomAvailibilty {
	static Scanner sc = new Scanner(System.in);
		static int choice;
	public static void roomType() throws RoomAlreadyBookedException {
		System.out.println("Choose room type :\r\n" + 
				"1. Luxury Double Room \r\n" + 
				"2.Deluxe Double Room \r\n" + 
				"3. Luxury Single Room \r\n" + 
				"4.Deluxe Single Room\r\n" + 
				"");
		switch(choice) {
		case 1:
			choice=sc.nextInt();
		System.out.println("Number of double beds : 1\r\n" + 
				"AC : Yes\r\n" + 
				"Free breakfast : Yes\r\n" + 
				"Charge per day:4000 \r\n" + 	 
				"");
		break;
		
//		case 2: 
//			System.out.println("Number of rooms available : 20");
//			break;
//		case 3:
//			System.out.println("Choose room number from : \r\n" + "1,2,3,4,5,6,7,8,9,10\r\n" ); 
//				System.out.println("Enter room number: \n" );
//				int room=sc.nextInt();
//				while(room==5 || room==8) {
//						throw new RoomAlreadyBookedException("Room is already Booked please select some other rooms");	
//				}
////				room=sc.nextInt();
//				
//				System.out.println("Enter customer name: \n" );
//				sc.next();
//				System.out.println("Enter contact number: \n" );
//				sc.nextLong();
//				break;
			
		}

}
}