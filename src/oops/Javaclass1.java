package oops;

public class Javaclass1 {
	
 
	public int rollno;
	
	
	public int employeno =453;
	
	public void manoj() {
		
		
		int id = 123;
		
	    String name= "sai";
	
         System.out.println("the id is:"+id+ "the name is:"+name);		
	}
	
	
	
	public void rollnumber(int rollno) {
		
		System.out.println("the roll no is:"+rollno);
		
	}
	
	
	public void employerollno() {
		
		
		System.out.println(employeno);
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Javaclass1 obj = new Javaclass1();
		 
		 obj.rollnumber(435);
		
		 obj.manoj();
		 
		 System.out.println(obj.employeno);
		 
		 obj.employerollno();

	}

}
