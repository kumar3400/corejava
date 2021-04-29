package inheritance;

//In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:

public class Bike extends vehicle {
	 
	
	
	public void Bikename() {
		
		
		System.out.println("bike name is :"+name+ "\t" + "bike speed is :"+speed);
		System.out.println(a);
 			
	}
	
	 
}

/* multiple inheritance:To reduce the complexity and simplify the language,
 *  multiple inheritance is not supported in java.Consider a scenario where A, B, and C are three classes.
 *   The C class inherits A and B classes. If A and B classes have the same method and you call it from child class 
 *   object, there will be ambiguity to call the method of A or B class.
 * 
 * class A{  

void msg(){System.out.println("Hello");}  
}  
class B{  
void msg(){System.out.println("Welcome");}  
}  
class C extends A,B{//suppose if it were  
   
 public static void main(String args[]){  
   C obj=new C();  
   obj.msg();//Now which msg() method would be invoked?  
}  
 * 
 * 
*/