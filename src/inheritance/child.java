package inheritance;

public class child extends parent {
	
	 


 public void sai() {
	 
	 System.out.println("sai");
	 name("saikumar");
	 school("svn");
	 System.out.println(a);
	 print();
 }

 
 

public static void main(String []args) {
	
	
	child obj = new child();
	
	//obj.print();
	obj.sai();
	System.out.println(a);
	 

}

}
