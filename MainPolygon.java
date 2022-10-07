package javaversion;

import java.util.Scanner;

class MainPolygon {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);

	    System.out.print("Enter length: ");
	    int l =sc.nextInt();
	    
	    System.out.print("Enter breath: ");
	    int b  =sc.nextInt();

	    sc.close();
	   
	    
	    
		Rectangle r=new Rectangle();
		r.getArea(l,b);
		

	}

}
