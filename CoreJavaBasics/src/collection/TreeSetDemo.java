package collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		TreeSet<String> ts1 = new TreeSet<String>();
//		ts1.add("Rahul");
//		ts1.add("Kunal");
//		ts1.add("Sagar");
//		ts1.add("Amardeep");
//		System.out.println(ts1);
//		
//		TreeSet<String> ts2 = new TreeSet<String>(ts1);
		
		
//		TreeSet<Integer> ts3 = new TreeSet<Integer>(new MyComparatorDemo());
//		ts3.add(1);
//		ts3.add(50);
//		ts3.add(20);
//		ts3.add(152);
//		System.out.println(ts3);
		
		@SuppressWarnings("unchecked")
		TreeSet<String> ts4 = new TreeSet<String>(new MyComparatorDemo());
		ts4.add("Anas");
		ts4.add("Rahul");
		ts4.add("Jarvis");
		ts4.add("BatMan");
		System.out.println(ts4);
		
//		TreeSet<String> ts5 = new TreeSet<String>(new MyComparatorDemo());
//		ts4.add("Go");
////		ts4.add("Rahul");
////		ts4.add("Jarvis");
////		ts4.add("BatMan");
//		System.out.println(ts5);
//		
//	}

}
}