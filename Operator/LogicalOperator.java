package Operator;

import java.util.Scanner;

class LogicalOperator {

	public static void main(String[] args) {
		
		 Scanner sc = new  Scanner(System.in);
		   System.out.println("Enter 1st number:");
		   int Num1= sc.nextInt();
		   
		   System.out.println("Enter 2nd number:");
		   int Num2 = sc.nextInt();
		   
		   System.out.println("Enter 3rd number:");
		   int Num3= sc.nextInt();
		   
		   sc.close();
		   
		   System.out.println("Performing AND Operation");
		   
		   //using logical AND to verify 2 String
		   
		   if((Num1<Num2)&&(Num2==Num3))
		   {
			 int sum= Num1+Num2+Num3;  
			 System.out.println("Sum of number is:" +  sum);
			 
		   }
		   else
		   {
			   System.out.println("False Condition.");
		   }
		  
		   
		   System.out.println("Performing OR Operation");
		   
		   //using logical OR to verify 2 String
		   if((Num1<Num2)||(Num2==Num3))
		   {
		   
		      int sum= Num1+Num2+Num3;  
				 System.out.println("Sum of number is:" +  sum);
		    }
			  
		      else
			  
			   {
				   System.out.println("False Condition.");
			   }
		      
		  
		   System.out.println("Performing NOT Operation");
		   System.out.println("!(Num1<Num2)" + !(Num1<Num2));
		   System.out.println("!(Num2<Num3)" + !(Num2<Num3));



		 

	}
}


    