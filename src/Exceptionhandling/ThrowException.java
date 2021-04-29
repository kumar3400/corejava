package Exceptionhandling;

public class ThrowException {
	
	static void checkage(int age) {
		if(age<18) {
			
			throw new ArithmeticException("Access is denied-you must be at least 18 years");
			
			
		}else {
			
			System.out.println("access is granted - your old is enough ");
		}
		
	}
	
	public static void main(String []args) {
		
		checkage(15);
		
		
	}

}
