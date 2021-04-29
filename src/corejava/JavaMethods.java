package corejava;

public class JavaMethods {
	
	
	
	
	//1)A method is a block of code which only runs when it is called. You can pass data, known as parameters, into a method
	
	static void Mymethod() {
		
		System.out.println("1.my method name is saikumar");
	}
	
	
	
	
	
	//2method with parameters 
	 static void name(String  sai) {
		 
		 
		 System.out.println("2."+sai+"\t is  my name");
	 }
	 
	 
	 
	 
	 
	//method return values
	 static int myMethod1(int x) {
		 
		 return 5+x;

		 
	 }
	 
	 
	 public  static int mm(int a, int b) {
		 
		 
		
		 int c=a+b;
		 
		 
		 System.out.println(c);
		return c;
		 
		 
		 
		 
		 
	 }
	 
	public static void main(String []args) {
	
		Mymethod();
		name("hero");
		System.out.println("3. my method return value is "+  myMethod1(2));
		mm(10,20);
        
		
		
		//by method calling should be have semicolon
	}
	

}
