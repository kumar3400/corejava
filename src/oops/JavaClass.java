package oops;

import Accessmodifiers.ClassA;

public class JavaClass {
	
	//main method with in the class
	
	public int id=123;
	
	private static String name ; 
	//="sai";
	
	public    void sai1(String sa){
		
		float sal =1023.5f;
		System.out.println("salary is"+sal);
		System.out.println(id);
		
		System.out.println(sa);
	}
	
	public void add(int a , int b) {
		
		int c = a+b;
		
		System.out.println(c);
	}
	
	public static void main(String args[]) {
	 
		
		
		JavaClass java =new JavaClass();//object
		JavaClass java1 =new JavaClass();//multiple objects
		
		//System.out.println(java.id);//You can access attributes by creating an object of the class, and by using the dot syntax (.): and name is a attribute
		
		System.out.println(name);//we cannot access private directly ,we use from encapsulation to acess the private 
		
		java1.sai1("kumar");
		
		java1.setName("saikumar");
		
		System.out.println(java1.getName());
		
		java1.add(12, 13);
		
		 
		 
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
} 
