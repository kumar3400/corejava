package keywords;

public class This {
	
	//The this keyword refers to the current object in a method or constructor.
	//The most common use of the this keyword is to eliminate the confusion between class attributes and parameters with the same name 
	
	int rollno;
	String name;
	float fee;
	
	This(int rollno,String name, float fee){
		
		this.rollno =rollno;
		this.name=name;
		this.fee=fee;
		
	}
	
	public void show() {
		
		System.out.println("roll number is " + rollno +"\t"+ "name is " + name  +"\t"+ "fee is"+"\t" + fee);
		
	}
	
	/*public void show() {
		
		System.out.println();
	}*/
	
	

}
