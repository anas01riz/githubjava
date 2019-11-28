package collection;

import java.util.Comparator;
import java.util.Scanner;

public class MyComparatorDemo implements Comparator{

	public static void main(String[] args) {
	
	}
//	@Override
//	public int compare(Object obj1, Object obj2) {
//
//		Integer I1 = (Integer)(obj1);
//		Integer I2 = (Integer)(obj2);
//		if (I1<I2)
//			return 1;
//		else if (I1 > I2)
//			return -1;
//		else
//		return 0;
		
		@Override
		public int compare(Object obj1, Object obj2) {

			String I1 = (String)obj1;
			String I2 = (String)obj2;
//			if (I1==I2)
//			{
//				System.out.println("True");
//			}
////			return I1.compareTo(I2);
//			return (I1.compareTo(I2))
////			return 1;
////		else if (I1 > I2)
////			return -1;
////		else
//		return 0;
			return (I2.compareTo(I1));
			
	
	
	}

}
