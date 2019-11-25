package stringss;

import java.util.StringTokenizer;

public class SToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("Hi|Java! ","e");
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}

}
