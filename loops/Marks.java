package loops;
	
//Java Program to Enter Marks of Five Subjects

import java.util.Scanner;
 class Marks {
	

	 public static void main(String[] args) {
		   Scanner sc = new  Scanner(System.in);
		
		   { 
			   System.out.println("Enter Your name:-"); 
			   String n1 =sc.next();
		   }
	     

	     System.out.println("Enter the marks of five subjects:-\n");

	     // To store the values of five subjects
	     float sub_1 = sc.nextFloat();
	     float sub_2 = sc.nextFloat();
	     float sub_3 = sc.nextFloat();
	     float sub_4 = sc.nextFloat();
	     float sub_5 = sc.nextFloat();

	     float total;
		   sc.close();

	     // Calculate total, average and percentage
	     total = sub_1 + sub_2 + sub_3 + sub_4 + sub_5;

	     

	     // It will produce the final output
	     System.out.println("\nThe Total marks   = " + total + "/500.0");
	   
	}
	}

