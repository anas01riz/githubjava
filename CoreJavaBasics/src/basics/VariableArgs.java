package basics;

import java.util.Scanner;

public class VariableArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
//		Scanner st = new Scanner(System.in);
//		System.out.println("Enter the number");
//		n = st.nextInt();
		add(1,2,3,4);
	
	}
	
	static void add(int... i) {
		for (int n:i) {
			System.out.println(n);
		}
	}
	}


