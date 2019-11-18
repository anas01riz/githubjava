package ques;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner st = new Scanner(System.in);
		System.out.println("Enter the Year");
		year = st.nextInt();
		if (year%4==0 || ((year%4==0) && (year%100==0))) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not a Leap Year");
		}

	}

}
