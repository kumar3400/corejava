package javainterviewcoding;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
	String str ="saikumar";
		
	//string index value starts from 0
		
	  int len=str.length();//8
	  
	  String rev="";
 	  
		// (len-1) means length is start from 1 and  int i index start from 0 then we have to keep (len-1)
	  for(int i=len-1;i>=0;i--) {
		  
		  
		    rev = rev + str.charAt(i);
		  
 		 
		  
	  }
		
	  System.out.println(rev);

		
	
 		 
		
	}

}
