package keywords;

public class Final {
	
	 final int speedlimit =90;//If you make any variable as final, you cannot change the value of final variable(It will be constant).
	final static int speedlimit1 =70;
	
	  
	
	
	public void run() {
		
		
		// speedlimit =70;
		System.out.println(speedlimit);
	}
	
	public static void main(String args[]) {
		
		Final obj = new Final();
		
		obj.run();
		
		 

	}
	
	

}
