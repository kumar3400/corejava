package AjayPractice;

import oops.JavaClass;

public class example1 {
	


	public void Add(int a ,int b) {
		
	  
		int c =a+b;
		
		System.out.println(c);	
	}
	
	public void Add1() {
		
		int z = 3;
		
		int y = 2;
		
		
		int x =z+y;
		
		System.out.println("the adding values is :"+x);
	}
	
	
	
	
	public static void main(String []args){
		
		example1 obj = new example1();
		obj.Add(1,4);
		obj.Add1();
		
		
	}
	
}