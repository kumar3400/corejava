package Interface;

public  class Saishruthi implements Sai,Sai2 {

	@Override
	public void add() {
		
		System.out.println("hello sai");
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("hello saikumar ji");
		System.out.println(c);
	 	System.out.println(name);
        
		
		
	}
	 
	 
	//non over ride method
	public void change() {  
		
		System.out.println("hi");
	}
   
	 
	
	//non override method
			public void saik() {
				   
				   
				   System.out.println("ksk");
				   
			   }
	
			 public static void sai() {
				   
				   System.out.println("haik");
			   }
			   
			 
			   
	
	public static void main (String []args) {
		
		Saishruthi obj =new Saishruthi();
		obj.add();
		obj.change();
		obj.display();
		obj.saik();
             sai();
             obj.kumar();
             
             
           
             
           
		
		
	
		
		System.out.println(a);
 	System.out.println(b);
		//System.out.println("hello sai");
 	
 	
 	
 	
 	
 	
 	
 	
 	
		
		
 
	}


	@Override
	public void kumar() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}


	 


	

}
