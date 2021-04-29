package Polymorphism;

public class Methodoverloading {
	
	//If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
	
	public void sum(int x , int y) {
		
         int c = (x+ y);
		
         System.out.println(c);
		
	}
	
	public int sum(int x , int y ,int z) {
		int s =(x+y+z);
		System.out.println("the value is:"+s);
		return s;
		
		 
		
	}
	
	public double sum(double x , double y) {
		
		return(x+y);
		
		
 	}
	
	
	public static void main(String []args) {
		
		Methodoverloading  obj = new Methodoverloading();
		obj.sum(10, 20, 30);
		
		obj.sum(20, 30);
		
		//System.out.println(obj.sum(10, 20));
		
		
		 
		System.out.println(obj.sum(10.5, 20.2));

		
		
	}

}
