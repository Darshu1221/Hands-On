package Operator;
import java.util.Scanner;

 class AssignmentOperator {

	public static void main(String[] args) {

		 Scanner sc = new  Scanner(System.in);
		   System.out.println("Enter 1st number:");
		   int Num1= sc.nextInt();
		   
		   System.out.println("Enter 2nd number:");
		   int Num2 = sc.nextInt();
		   
		   sc.close();
		   
		   //Adding and Assigning values...
		   
		   Num1+=Num2;
		   System.out.println("Num1=:"+ Num1);
		   
		   //Substracting and Assigning values...

		   Num1-=Num2;
		   System.out.println("Num1=:"+ Num1);
		   
		   //Multiplying and Assigning values...

		   Num1*=Num2;
		   System.out.println("Num1=:"+ Num1);
		   
		   //Dividing and Assigning values...

		   Num1%=Num2;
		   System.out.println("Num1=:"+Num1);




 
	}

}
