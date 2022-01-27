package Accessmodifiers;

 

//The methods or data members declared as private are accessible only within the class in which they are declared.
//Any other class of same package will not be able to access these members.
//private means “only visible within the enclosing class”.

public  class ClassA {
	
	// private void display() {(private for private2 class)
  public void display() {
		
		int no =10;
		
		System.out.println("java acess modifiers private the int number is "+no);
		
		System.out.println(no);
   }
   
   
	
	public   void show() {
		
		System.out.println("hai");
	}
   
   public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		ClassA obj =new ClassA();
	//obj.display();
		
		obj.show();
	
	 
 
}
}
