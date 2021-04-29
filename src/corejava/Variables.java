package corejava;


                        
//   syntax of  variable(type variable = value;)


public class Variables {
	
	
	

	//local variable
	
	public void add1() {
		
		
		int a =10;
		int b=20;
		
		int  c =a+b;
		System.out.println(c);
	}
	
	
	
	public int add3(int a , int b) {
		
	 int s =a+b;
	 
	 
	 System.out.println("the add value is:"+s);
	
	 return s;
	 
	 
	 
	  
	}
	
	
	
	
	//global variable
	

	int a=10;
	int b=15;
	int d;
	
	public void add2() {
		
		 d=a+b;
		// return d;
		 System.out.println(d);
		
		}
	
	
	public int  substraction(int a,int c) {
		
	    	
	    int d = a-c;
	    
	    
	    System.out.println("the substraction value is:"+d);
		return d;
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String     name1="sai";//string is a type name1 is variable  sai is a value
		String     name2="kumar";
		String     fullname =name1+name2;
		
		
		
		

	
		
		int        x=1;//integer
		int        y=2;
		
		boolean    value =true;//boolean
		float      value1=12.2f;//float
		char       letter='d';//char
		
		System.out.println("hai my name is \n"   +  fullname);
		
		System.out.println(x+y);
		
		System.out.println(value);
		System.out.println(value1);
		System.out.println(letter);
		
		
		Variables obj = new Variables();
		
		obj.add1();	
		obj.add2();
		int a =obj.add3(20,40);
		//System.out.println(a);
		obj.substraction(11, 17);
		
		

 		
		
		

	}

}
