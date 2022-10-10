package Operator;
import java.util.Scanner;

public class UnaryOperator {

	public static void main(String[] args) {
		 Scanner sc = new  Scanner(System.in);
		   System.out.println("Enter 1st number:");
		   int Num1= sc.nextInt();
		   sc.close();
		   
		   //Performing Pre increment operation...
		   
		   ++Num1;
		   System.out.println("Pre Increment Value:"+ Num1);
		 
		   
		   //Performing Post increment operation...
		   
		   Num1++;
		   System.out.println("Post Increment Value:"+ Num1);
		   
		   //Performing Pre decrement operation...
		   
		   --Num1;
		   System.out.println("Pre Decrement Value:"+ Num1);
		 
		   
		   //Performing Post decrement operation...
		   
		   Num1--;
		   System.out.println("Post Decrement Value:"+ Num1);
		 

	}

}
