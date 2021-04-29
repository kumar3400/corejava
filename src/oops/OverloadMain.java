package oops;


/*Question: Can we overload a main() method in Java?:

Answer: Yes, you can overload main method in Java. But the program doesn't execute the overloaded main method when you run your program, 
you have to call the overloaded main method from the actual main method.

that means main method acts as an entry point for the java interpreter to start the execute of the application.
 where as a loaded main need to be called from main.
 */

public class OverloadMain {
	
	
	
	
	

	public static void main(String[] args) {//string[] array parameter
		// TODO Auto-generated method stub
		
		
		System.out.println("main method1");
		main("k");
		main(2);

	}
	
	
	public static void main(String args) { //string is string param
		
		System.out.println("sai");
		
		
	}
	
	
	public static void main(int a) {
		
		
		System.out.println("the value of int is :"+a);
	}

}
