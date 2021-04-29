package Abstraction;

 //A class which is declared as abstract is known as an abstract class. It can have abstract and non-abstract methods.
//It needs to be extended and its method implemented. It cannot be instantiated.(means it cannot create object if need through inheritance)

//Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
 
//we can call with class name and method  with abstract keyword

//we cannot create object of abstartc class
//we can define static and nonstaic varible in abstract class
abstract  class Animal {
	
	public abstract  void animalsound();//Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
    public abstract void sound();
	
	public void sleep() {
		
		System.out.println("zzz");
		//
	}
	
	
	

}
