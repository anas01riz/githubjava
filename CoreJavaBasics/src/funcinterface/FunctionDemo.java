package funcinterface;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,Integer> ref = (str) -> str.length();
		System.out.println(ref.apply("eswar"));
		
		

	}

}
