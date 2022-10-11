/*
 * Test whether the person is eligible to give vote using if -else
 * date:- 11/10/22
 */


package loops;
//Java program to check vote eligibility 
import java.util.Scanner;

 class Voting {
public static void main(String[] args) 
{
 // Declaring variables
 int age, diff;
 // taking user input
 Scanner sc = new  Scanner(System.in); 
 System.out.println("Please enter your age: ");
 age = sc.nextInt();
 
 sc.close();

 // Checking condition for voting..
 if(age>=18)
 {
     System.out.println("You are eligible for voting.");
 }
 else
 {
 diff = (18 - age);
 System.out.println("Sorry,You can vote after: "+ diff + " years");
 }
}
}
