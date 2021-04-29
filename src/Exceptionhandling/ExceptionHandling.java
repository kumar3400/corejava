package Exceptionhandling;

public class ExceptionHandling {
	
	public static void main (String []args) {
		
		
		//Arithmetic exception
		
		try {
			
			int data =100/0;
			
		}catch(ArithmeticException e) {
			
			
			System.out.println(e);
			System.out.println("remainig code");
		}
		
		//Null pointer exception
		
		try {
			
			String s =null;
			System.out.println("\t"+s.length());

			
		}catch(NullPointerException n) {
			
			System.out.println(n);
		//	System.out.println("\n hi sai");
			
			
		}
		
		//Number format exception
		try {
			
			String s ="abc";
 
			
			 
			int i =Integer.parseInt(s);
 
		}catch(NumberFormatException N) {
			
			System.out.println("this is "+ N);
			
				
			
		}
		
		 //ArrayIndexOutOfBoundsException
		 String[] names = new String[3];
	        names[0] = "Sherlock";
	        names[1] = "Watson";
	        names[2] = "Mary";
	        System.out.println("\n"+names[1]);
	        try {
	            System.out.println(names[3]);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            e.printStackTrace();
	            System.out.println("The index used is out of the bounds of array.\n"
	                    + "Deal with it.");
	        }
	        System.out.println("The execution of further statements continues.");
		
		
		
		
	}

}
