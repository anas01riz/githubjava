package matrix;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j,k,l,a;
		System.out.println("Enter total rows and columns: ");
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int column = s.nextInt();
		int array[][] = new int[row][column];
		System.out.println("Enter matrix:");
	 	for(i = 0; i < row; i++)
	  	{
	   	    for(j = 0; j < column; j++) 
	     	    {
	        	array[i][j] = s.nextInt();
	        	System.out.print(" ");
	            }
	  	}
		System.out.println("The above matrix before Transpose is ");
//		for (int i = 0; i < a.length - 1; i++) {
//		    for (int k = 0; k < a.length - 1; k++) {
//		        if (a[i] != a[k + 1]) {
//		            System.out.println(a[i] + " not the same with  " + a[k + 1] + "\n");
//		        }
//		    }
//		}
	  	for(i = 0; i < row; i++)
	    	{
	      	    for(j = 0; j < column; j++)
	            {
	          	System.out.print(array[i][j]+" ");
	            }
	            System.out.println(" ");
	        }
	  	
	if (row==column) {
		System.out.println("Same");
	}
		else System.out.println("Not Same");
	}
	}


