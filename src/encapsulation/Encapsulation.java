package encapsulation;

public class Encapsulation {
	
	//Encapsulation is defined as the wrapping up of data under a single unit. It is the mechanism that binds together code and the data it manipulates.
	//Other way to think about encapsulation is, it is a protective shield that prevents the data from being accessed by the code outside this shield.
//Encapsulation can be achieved by: Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.
//It is a way to achieve data hiding in Java because other class will not be able to access the data through the private data members.

  
	  // private variables declared  
    // these can only be accessed by  
    // public methods of class 
	
	
	/*private  String name="saik"; 
   private int id=10;
   private int age=23;
   */
	private  String name; 
	   private int id;
	   private int age;
   
   
   public int getage() {
	   
	   return age;
   }
   
   public void setage(int newage) {
	   
	   age=newage;
	   
	   
   }
   
   public String getname() {
	   
	   return name;
   }
   
   public void setname(String name) {
	   
	   
	   this.name = name;
   }
   
   
   public int getid() {
	   
	   return id;
   }
   
   public void setid(int  newid) {
	   
	   id =newid;
   }
   
   
      public static void main(String args[]) {
	 
	  Encapsulation en = new Encapsulation();
	  en.setage(24);
	  en.setid(11596669);
	  en.setname("kumar");
	  
	  System.out.println(en.getage());
	  System.out.println(en.getid());
	  System.out.println(en.getname());
 }

}
