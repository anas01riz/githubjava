package funcinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Predicate<Integer> ref = (num) -> num % 2 !=0;
		  System.out.println(ref.test(5)); // return true or false
		  
		  
		  BiPredicate<String,String> ref1 = (Str1,Str2) -> Str1.equals(Str2);
		  System.out.println(ref1.test("eswar", "hello"));
		  
	}

}
