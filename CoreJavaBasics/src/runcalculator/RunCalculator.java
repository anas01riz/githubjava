package runcalculator;

import java.util.Scanner;

public class RunCalculator {

private static Scanner sc;

public static void main(String[] args) {
int x,y,z;
int sum;
float total;
float output;
sc = new Scanner(System.in);

	
   x=sc.nextInt();
   y=sc.nextInt();
   z=sc.nextInt();
  
   sum=(y*4)+(z*6);
   System.out.println("Sum = "+sum);
   total=x-sum;
   System.out.println("Total="+total);
   System.out.println(x);
  output=100*total/x;
//  System.out.format("%.2f" +output);
  System.out.println("Output" +String.format("%.2f", output));
}
}



