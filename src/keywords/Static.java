package keywords;

public class Static {
	
	//static variable  static means common property refer of all objects
	
	int number =2;
	
	private static String name ="java";
	
	//static method 
	static void saikumar() {
		
		System.out.println("hello sai");
	}
	
	
	public static void main(String []args) {
		
		Static st =new Static();
		
		System.out.println(st.number);
		System.out.println(name);//we can access with out creating  object because it is static 
		
		saikumar();//with out  object we can access the method of static
		
		
		
	
	}

}
