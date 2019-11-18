package ques;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner st = new Scanner(System.in);
		System.out.println("Enter the number");
		number = st.nextInt();
		if (number%2==0) {
			System.out.println("Even");
			
		}
		else {
			System.out.println("Odd");
		}
		
		
		
	}

}
