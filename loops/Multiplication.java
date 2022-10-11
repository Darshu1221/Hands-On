	// Java Program to print the multiplication table of the
	// number N.
package loops;
import java.util.Scanner;

class Multiplication {
	  
	public static void main(String args[]) {
	     
		System.out.println("Enter an integer variable : ");
	     
		Scanner sc = new Scanner(System.in);
	    
		int num = sc.nextInt();
	     
		for(int i=1; i<= 10; i++) 
		{
	        
			System.out.println(""+num+" X "+i+" = "+(num*i));
	     }
	   }
}