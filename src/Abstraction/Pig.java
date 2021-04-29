package Abstraction;

public class Pig extends Animal{ 

	@Override
	public void animalsound() {
		// TODO Auto-generated method stub
		//the body of  animalsound() provide here
		System.out.println("the pig says:wee wee");
		
		
	}
	
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("bow bow");
	}

	
	public void work() {
		
		
		System.out.println("sleeping");
	}
	
	public static void main(String args[]) {
		
		
		Pig obj = new Pig();
		
		obj.animalsound();
		obj.sleep();
		obj.sound();
 		
		
		
		Animal an = new Pig();//dynamic polymorphism
		//an.animalsound();
		//an.work();//we cant acheive this we implemented work method in pig class so animal cant  access this method so we cant acheive 100%abstraction
	}

	
	
	
}
