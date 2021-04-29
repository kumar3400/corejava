package javainterviewcoding;

public class RemoveJunkinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 String s ="***** saikumar $$$$$$ 12345 ";  
	        String s1 ="sai**kumar**1234**";   
	       String  b=s.replaceAll("[^a-zA-Z1-9]","");
	       String b1 = s.replaceAll("[^a-zA-Z1-9]","");
	       
	       System.out.println(b);
	       System.out.println(b1);

	}

}
