package keywords;

//We can use super keyword to access the data member or field of parent class. It is used if parent class and child class have same fields.



public class Super1  extends Super{
	
	String colour ="black";
	
	
	public void eat() {
		
		System.out.println(colour);
		System.out.println(super.colour);//super keyword to access the data member or field of parent class 

	
	}
	
	public void show() {
		
		
		eat();
		super.eat();//eat method call from Super class with super keyword
		
	}
	
	public static void main(String []args) {
		
		Super1 obj = new Super1();
		obj.show();
		
		
	}
	
	 
	}


