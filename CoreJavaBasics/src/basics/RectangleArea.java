package basics;

import java.util.Scanner;

public class RectangleArea extends Rectangle{
	
	void read_input() {
		
		System.out.println(width);
		System.out.println(height);
//		Scanner st = new Scanner(System.in);
//		System.out.println("Enter the width");
//		width = st.nextInt();
//		System.out.println("Enter the height");
//		height = st.nextInt();
		
		
	}
	
	void display() {
		
//		this.width=width;
//		this.height=height;
		System.out.println(width * height);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RectangleArea ar = new RectangleArea();
		ar.read_input();
		ar.display();
		
		
	}

}
