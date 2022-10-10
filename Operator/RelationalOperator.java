package Operator;
import java.util.Scanner;

 class RelationalOperator {

	public static void main(String[] args) {
		//creating scanner class object to take input from the user
		   Scanner sc = new  Scanner(System.in);
		   
		   System.out.println("Enter 1st number:");
		   int Num1= sc.nextInt();
		   
		   System.out.println("Enter 2nd number:");
		   int Num2 = sc.nextInt();
		  
		   sc.close();
		   
		   //Performing equal to operation...
		   
		   System.out.println("Num1==Num2:"+(Num1==Num2));
		   
		   //Performing is not equal to operation...
		   
		   System.out.println("Num1!=Num2:"+(Num1!=Num2));
		   
		   //Performing greater than operation...
		   
		   System.out.println("Num1>Num2:"+(Num1>Num2));
		   
		   //Performing less than Operation...
		   
		   System.out.println("Num1<Num2:"+(Num1<Num2));
		   
		   //Performing less than equal to operation...
		   
		   System.out.println("Num1>=Num2:"+(Num1>=Num2));
		   
		   //Performin greater than equal to operation...
		   
		   System.out.println("Num1<=Num2:"+(Num1<=Num2));





		   
	}

}
