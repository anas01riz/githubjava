package stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(5);
		marks.add(1);
		marks.add(15);
		marks.add(20);
		//filter
		List<Integer> lst = marks.stream().filter(e1->e1%2==0).collect(Collectors.toList());
		System.out.println(lst); //[20]
		
		//map-apply function on each element in collection
		List<Integer> lst2 = marks.stream().map(e1->e1+5).collect(Collectors.toList());
		System.out.println(lst2); //[10, 6, 20, 25]
		
		//count number of elements
		long lst3 = marks.stream().filter(e1->e1%2==0).count();
		System.out.println(lst3); //1
		
		//sort elements
		List<Integer> lst4 = marks.stream().sorted().collect(Collectors.toList());
		System.out.println(lst4); //[1,5,15,20]
		
		//sort-descending order
		//(i1,i2) ->(i1<i2)?1:(i1>i2)?-1:0
		List<Integer> lst5 = marks.stream().sorted((i1,i2) ->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		System.out.println(lst5); //[20,15,5,1]
		
		//minimum element
		Integer lst6 = marks.stream().min((i1,i2) -> (i1<i2)?1:(i1>i2)?-1:0).get();
		System.out.println("min: "+lst6); //20
		
		//maximum element
		Integer lst7 = marks.stream().max((i1,i2) -> (i1<i2)?1:(i1>i2)?-1:0).get();
		System.out.println("max: "+lst7); //1
		
		//foreach() - print all arraylist elements
		System.out.println("array elements");
		marks.parallelStream().forEach(System.out::println); //15 20 5 1
		
	}

}
