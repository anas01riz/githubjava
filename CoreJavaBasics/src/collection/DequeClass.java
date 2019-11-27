package collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque d = new ArrayDeque();
		d.add("Anas");
		d.add("John");
		d.add("Doe");
//		System.out.println(d);
		Iterator itr = d.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
