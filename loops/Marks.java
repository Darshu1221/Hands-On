package loops;
	
//Java Program to Enter Marks of Five Subjects and Calculate Total, Percentage, and Grade

import java.util.Scanner;
 class Marks {
	

	 public static void main(String[] args) {
		 Scanner sub = new  Scanner(System.in);
		
		   { 
			   System.out.println("Enter Your name:-"); 
			  String name=sub.next();
		   }
	     

	     System.out.println("Enter the marks of five subjects:-\n");

	     // To store the values of five subjects
	     float sub_1 = sub.nextFloat();
	     float sub_2 = sub.nextFloat();
	     float sub_3 = sub.nextFloat();
	     float sub_4 = sub.nextFloat();
	     float sub_5 = sub.nextFloat();

	     float total;
	    
	     // Calculate total, average and percentage
	     total = sub_1 + sub_2 + sub_3 + sub_4 + sub_5;

	     

	     // It will produce the final output
	     System.out.println("\nThe Total marks   = " + total + "/500.0");
	   
	}
	}

