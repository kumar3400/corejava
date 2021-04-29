package Accessmodifiers;

import oops.JavaClass;

//import oops.*;(we can use import package.* also means it will come all classes in oops package)

//The protected access modifier is accessible within package and outside the package but through inheritance only.

public class Protected  extends JavaClass {
	
	
	
	public static void main(String []args) {
		
		Protected obj = new Protected();
		
		System.out.println(obj.getName());
		
	}
	
	

}
