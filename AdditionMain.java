package javaversion;
import java.util.Scanner;
class  AdditionMain {

	public static void main(String[] args) 
		  {
		
		Scanner sc =new Scanner(System.in);

	    System.out.print("Enter First No: ");
	    int a =sc.nextInt();
	    
	    System.out.print("Enter Second No: ");
	    int b =sc.nextInt();
	    
	    System.out.print("Enter Third No: ");
	    int c =sc.nextInt();

	    sc.close();
	    
		    Addition obj = new Addition();
		    System.out.println(obj.add(a,b));
		    System.out.println(obj.add(a,b,c));
		  }
}
