package maximumproducts;

import java.util.Arrays;
import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	 int n=sc.nextInt();
	 int sum=0,output=0;
	 int array[] = new int[n];
	 for (int i=0;i<n;i++)
	 {
		 array[i]=sc.nextInt();
		 }
	 	Arrays.sort(array);
	 	int maaxelement= array[n-1];
	 	for (int i=0;i<n;i++)
	 	{
	 		sum = array[i]*array[i+1];
//	 		System.out.println(sum);
	 		if (sum==maaxelement)
	 		{
	 			System.out.println("Print Max"+ maaxelement);
	 			break;
	 		}
	 	
	 		else if (sum!=maaxelement){
	 			System.out.println("-1");
	 			break;
	 		}
	 	}
	}

}
