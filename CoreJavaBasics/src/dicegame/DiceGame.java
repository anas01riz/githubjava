package dicegame;

import java.util.Scanner;

public class DiceGame {

private static Scanner sc;

public static void main(String[] args) {
int x;
int y;
sc = new Scanner(System.in);


   x=sc.nextInt();
   y=sc.nextInt();

if((x>=0 && x<=6) && (y>=0 && y<=6))
{
if(x==y)
{
System.out.println("Points "+2*(x+y));
}
else
{
System.out.println(" Points "+(x+y));
}
}
else
{
System.out.println("Invalid Input");
}

}

}
