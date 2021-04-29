package Polymorphism;

//If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.

// we cannot override "final" in method over riding
public class MethodOverriding {
	
 
	final  int num =6;
 	void run() {
 		
 		 
		
		System.out.println("bike is running safely");
 	}
	
	public void walk() {
		
		System.out.println("man is walking");
	}
	
	

}
