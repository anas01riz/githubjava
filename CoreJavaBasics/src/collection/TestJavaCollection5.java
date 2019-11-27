package collection;
//package collection;
//
//
//import java.util.ArrayList;
//import java.util.Iterator;
//
//public class Test {
//
//public static void main(String[] args) {
//	int num1 = 10;
//	//AutoBoxing
////	Integer num2=num1;
//	Integer num2=Integer.valueOf(num1);
////	System.out.println(num2);
//	//AutoUnboxing
////	int num3 = num2;
//	int num3 =num2.intValue();
////	System.out.println(num3);
//	
//	 
//	
//	
//	
//	
//	
//	
//	
////	// TODO Auto-generated method stub
////	package package1;
////
////	import java.util.*; 
////	class TestJavaCollection1
////	{ 
//////	public static void main(String args[]){ 
//	ArrayList list=new ArrayList();//Creating arraylist 
//	list.add(10);
//	list.add("Anas");
//	list.add("Eswar");//Adding object in arraylist 
//	list.add("Shobana"); 
////	list.remove(2);
////	list.removeAll(list);
////	list.remove("Ravi");
//	
//	
////	//Traversing list through Iterator 
//	Iterator itr=list.iterator(); 
//	while(itr.hasNext()){ 
//	System.out.println(itr.next()); 
////	} 
////	} 
////	
////	}
////vector 
//
////	Vector v = new Vector();
////	Vector v = new Vector(1000,5);
////Vector v = new Vector();
////	v.add("Eswar");
////	v.add("Shobana");
////	v.add("null");
////	v.add(20);
////	v.addElement(12);
////	int i;
//for (int i=0;i<=10;i++)
//{
////v.addElement(i);
//}
////
////System.out.println(v);
////Enumeration e = v.elements();
////while (e.hasMoreElements())
////{
////	Integer I = (Integer)e.nextElement();
////System.out.println(e.nextElement());
////	if (I%2==0);
////	System.out.println(I);
//}
////	v.remove(1);
////	v.remove(null);
////	v.clear();
////	v.get(1);
////	System.out.println(v.capacity());
////	v.removeAllElements();
////	Iterator itr = v.iterator();
////	while (itr.hasNext()) {
////	System.out.println(itr.next());
////	
////	Stack s = new Stack();
////	System.out.println(s.push("Anas"));
////	s.push("Eswar");
////	s.push("Eswar");
////	s.push("Shobana");
////	s.push("Sumitha");
////	
////	System.out.println(s);
////	System.out.println(s.search("Eswar"));
////	System.out.println(s.search("A"));
////	s.push(10);
////	s.add(100);
////	s.peek();
//////	empty();
//}
//
//}
//

import java.util.*;  
public class TestJavaCollection5{ 
	
public static void main(String args[])
{  
PriorityQueue<String> queue=new PriorityQueue<String>();  
queue.add("Amit Sharma");  
queue.add("Vijay Raj");  
queue.add("JaiShankar");  
queue.add("Raj");  
System.out.println("head:"+queue.element());  
System.out.println("head:"+queue.peek());  
System.out.println("iterating the queue elements:");  
Iterator itr=queue.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
queue.remove();  
queue.poll();  
System.out.println("after removing two elements:");  
Iterator<String> itr2=queue.iterator();  
while(itr2.hasNext()){  
System.out.println(itr2.next());  
}  
}  
}
