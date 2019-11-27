package collection;

import java.util.LinkedHashSet;
import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		//HashSet 
//		HashSet<Integer> st= new HashSet<Integer>();
//		HashSet st1 = new HashSet();
////		st.add(1);
////		st.add("John");
////		st.add("Doe");
////		st.add("Doe");
////		st1.add("2");
//		st1.add("Eswar");
//		st1.add("Siva");
//		
////		String[] st11 = (String[]) st11.toArray();
//		String[] arr = new String[st1.size()];
//	     st1.toArray();
//		System.out.println(st1);
//		System.out.println(st1);
//		st1.contains("Anas");
//	System.out.println(st1.size());
//
//		//insertion order wont maintain
//		//no duplicates allowed
////		Iterator itr = st1.iterator();
////		while (itr.hasNext())
////		{
////			System.out.println(itr.next());
////		}
//		ListIterator itr1 = (ListIterator) st1.spliterator();
//		while (itr1.hasNext())
//		{
//			System.out.println(itr1.next());
//		}	
//		System.out.println();
//		while (itr1.hasPrevious())
//		{
//			System.out.println(itr1.previous());
//		}
//		System.out.println(st1.hashCode());
//		System.out.println(st1.hashCode());
		
		
		
		//linked hash set 
		LinkedHashSet lhs = new LinkedHashSet();
		
//		lhs.add("Anas");
		lhs.add("Anas");
		lhs.add("John");
		lhs.add("Eswar");
		System.out.println(lhs);
		Iterator itr = lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
//        
	}

}