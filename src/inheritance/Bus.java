package inheritance;

public class Bus extends Bike {
	
	
	 
	public void show() {
		
		
		
		System.out.println("Bus name is:"+name );
		 System.out.println("the vechicle speed is:"+ speed);
		 
		 vehicle vec = new vehicle(); 
		    vec.Bikename();

	}
	
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		Bus obj = new Bus();
		
		obj.show();
		//obj.Bikename();
		obj.Bikename();

	}

}
