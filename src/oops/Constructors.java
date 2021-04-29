package oops;

public class Constructors {
	
	
	//A constructor in Java is a special method that is used to initialize objects. 
	//The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:
	//the class name should be same with method name


	
	int modelyear;
	String modelname;
	
	//parameterised constructor
	private Constructors(int modelyear, String modelname) {
		
		this.modelyear=modelyear;
		this.modelname=modelname;

		
		System.out.println(modelname + modelyear);
		
	}
	
	public static void main(String []args) {
		
		Constructors mycon =new Constructors(2012,"benz");
		
		
		//System.out.println(mycon.modelyear+" "+mycon.modelname);

		
	}

}
