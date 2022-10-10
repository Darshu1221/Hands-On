package Operator;

import java.util.Scanner;

 class ArithmeticOperator {

	public static void main(String[] args) {
	  //creating scanner class object to take input from the user
	   Scanner sc = new  Scanner(System.in);
	   System.out.println("Enter 1st number:");
	   int i = sc.nextInt();
	   
	   System.out.println("Enter 2nd number:");
	   int j = sc.nextInt();
	   
	   sc.close();
	   
	   //writing operation
	   int add, sub, mul,mod;
	   double div;
	   add= i+j;
	   sub= i-j;
	   mul= i*j;
	   div= i/j;
	   mod= i%j;
	   
	   //Printing values
	   
	   System.out.println("Addition of two number is:" +add);
	   System.out.println("Substraction  of two number is:" +sub);
	   System.out.println("Multiplication  of two number is:" +mul);
	   System.out.println("Division of two number is:" +div);
	   System.out.println("Modules  of two number is:" +mod);

	   
	   

	}

}
