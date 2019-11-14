package ae;

import java.util.Scanner;
public class AritE {
	public static void main(String[] args) {
		
		int x,y,z,temp=0;
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		y=s.nextInt();
		z=s.nextInt();
		if(x+y==z)
		{
			System.out.println("Add");
			temp=1;
		}
		
		if(x-y==z)
		{
			System.out.println("Subtract");
			temp=1;
		}
		if(x*y==z)
		{
			System.out.println("Multiply");
			temp=1;
		}
		  if(x/y==z)
		  {
			System.out.println("Divide");
			temp=1;
		  }
		  if(x%y==z)
		  {
			System.out.println("Modulo");
			temp=1;
		  }
		 if(temp==0) 
			System.out.println("Not Possible");	
	}
}
