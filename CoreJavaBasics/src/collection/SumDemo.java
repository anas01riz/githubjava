package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class SumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i <= 100; ++i){
		if (i%2==0)
		al.add(i);
	}
		int sum = 0;
		Iterator<Integer> theIterator = al.iterator();
		while (theIterator.hasNext()) {
				sum = sum + theIterator.next();
			}
			System.out.println("The sum of all elements is " + sum);
		}
		
	}


