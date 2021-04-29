package oops;

public class NonParameterisedConstructor {
	
	
	String name;
	int rollno;
	
	
	
	public NonParameterisedConstructor() {
		
		name ="saikumar";
		rollno=123;
		
		
		System.out.println("the name is:"+name+"the roll no is:"+rollno);
	
		
	}
	
	public void display() {
		
		
		System.out.println("the name is :"+name);
		System.out.println("the roll no is :"+rollno);
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		NonParameterisedConstructor non = new NonParameterisedConstructor();
		
		non.display();

	}

}
