package java.Dicegame2.src.dicegame;

import java.util.Scanner;

public class DiceGame {

private static Scanner sc;

public static void main(String[] args) {
int x;
int y;
int z;
sc = new Scanner(System.in);


   x=sc.nextInt();
   y=sc.nextInt();
   

if((x>=0 && x<=6) && (y>=0 && y<=6))
{
	z=x+y;
if(z<8)
{

System.out.println("Points "+ (z-8));
}
else
{
	
System.out.println(" Points "+2*Math.abs(8-z));
}
}
else
{
System.out.println("Invalid Input");
}

}

}
