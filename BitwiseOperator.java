package HandsOn;

class BitwiseOperator {
public static void main(String[] args) {
    
	//Bitwise AND Operator...
	   
	   {   
		   int num1 = 9, num2 = 8;   
		   
		   // 1001 
		   // 1000 
		   // -------
		   //1000 = 8  
		   
		  System.out.println("num1 & num2 = " + (num1 & num2));   
	   }
		
		//Bitwise OR Operator...
	  
	   { 
		   int num1 = 9, num2  = 8;   
	 
		   // 1001 
		   //1000 
		   //----
		   //1001 = 9  
		System.out.println("num1 | num2 = " + (num1 | num2 ));
	   }
			
			//Bitwise XOR Operator...
	   {	
	   int num1 = 9, num2 = 8;   
			
			// 1001 
			//1000 
			//-----
			//0001 = 1  
			System.out.println("num1 ^ num2 = " + (num1  ^ num2)); 
	   }
		
}
}


