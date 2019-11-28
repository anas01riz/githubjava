package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();

		al.add(10);
		al.add(50);
		al.add(70);
		al.add(80);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
	}

}
