package ques;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1, number2;
		int temp;
		Scanner st= new Scanner(System.in);
		System.out.println("Enter the numbers");
		number1= st.nextInt();
		number2=st.nextInt();
		temp = number1;
		number1 = number2;
		number2 = temp;
		
		System.out.println(number1);
		System.out.println(number2);
		
		
		

	}

}
