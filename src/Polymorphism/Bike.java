package Polymorphism;

public class Bike  extends MethodOverriding {
	
	
	@Override
	 public void run() {
		 
		 //super.run();
		
		System.out.println("running very fast");
		
	}
	
	
	 
	public static void main(String []args) {
		
		 
	  MethodOverriding  obj = new Bike();//dynamic polymorhism
		obj.run();
		
		
		System.out.println(obj.num);
		obj.walk();
		
		 
		 
		
		//MethodOverriding obj1 =new MethodOverriding();
		//obj1.run();
		// in method over riding we cannot call same methods with one obj if we want to call we have to use "super"
	}

}
