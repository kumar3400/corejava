package Accessmodifiers;

import java.util.HashMap;

import javacollections.Hashmap;

//The methods or data members declared as private are accessible only within the class in which they are declared.
//Any other class of same package will not be able to access these members.
//private means “only visible within the enclosing class”.

public  class ClassA {
	
	// private void display() {(private for private2 class)
  public static  void display() {
		
		int number =10;
		
		
		HashMap<String, Integer>  value = new HashMap<String, Integer>();
		
		
		value.put("sai", 20);
		
		System.out.println("java acess modifiers private the int number is "+number);
		
		
 
		System.out.println("java acess modifiers private the int number is "+number);
		
		System.out.println(number);
 
   }
  
  
  
   
   
	
	public   void show() {
		
		System.out.println("hai");
	}
   
   public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		ClassA obj =new ClassA();
	//obj.display();
		
		obj.show();
	
	 
 
}
}
