package funcinterface;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Double> ref = () -> Math.random();    //will return any value between 0 and 1
		System.out.println(ref.get());
		
	}

}
