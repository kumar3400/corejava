package AjayPractice;

public class constct {
	
	
	int versionno;
	
	String carname;
	
	
	public void saikumar(String carname) {
		
		
		System.out.println(carname);
	}
	
	
	public constct(int versionno) {
		
		this.versionno=versionno;
		
	   System.out.println("versionname is:"+versionno);
	}
	 
	public static void main(String []args) {
		
		
		constct obj = new constct(123);
		
		obj.saikumar("ivtech");
		

		
	}

}
