package Accessmodifiers;

//Default: When no access modifier is specified for a class , method or data member – It is said to be having the default access modifier by default.
//The data members, class or methods which are not declared using any access modifiers i.e. having default access modifier are accessible only within the same package.

 class Default {
	
	 
	   
	public static void main(String args[]) {
		
	
		Public obj =new Public();
		
		obj.sai2();
		
		/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		The method sai2() is undefined for the type Public

		at Accessmodifiers.Default.main(Default.java:12)
		
		*/
          
		
	}
 }
