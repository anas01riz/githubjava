package funcinterface;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Consumer<String> ref = (name) -> System.out.println("Hello "+name);
		 ref.accept("Ram");
		 
		 //output is Hello Ram
	}

}
