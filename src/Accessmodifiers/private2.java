package Accessmodifiers;

public class private2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//The private access modifier is accessible only within the same class.
		//We can't assign private to outer class and interface.
		ClassA obj =new ClassA();
		
		obj.display(); // private void display() {(private for private2 class)
		    
		
		
		
	//obj.display();
	
	/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The method display() from the type ClassA is not visible means not public

	at Accessmodifiers.private2.main(private2.java:10)
	*/

		

	}

}
