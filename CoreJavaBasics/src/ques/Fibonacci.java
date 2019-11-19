package ques;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=0,number2=1,number3;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter total number of terms");
		int n=s.nextInt();
		System.out.println("The fibonacci series is:");
		System.out.print(number1+" "+number2+" ");
		//System.out.println(second);
		for(int i=2;i<=n;i++)
		{
			number3=number1+number2;
			System.out.print(number3+" ");
			number1=number2;
			number2=number3;
		}
	}

}