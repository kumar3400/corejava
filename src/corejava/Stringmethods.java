package corejava;

public class Stringmethods {
	
	
	public static void main(String []args) {
		
		//Java String charAt() method
		//syntax :    public char charAt(int index)
		String name ="hello";
		
		char result =name.charAt(1);
		
		System.out.println(result);
		
		
		// java string code point method
		
		//syntax of public int codePointAt(int index)
		
		String text ="saikumar";
		int result1 =text.codePointAt(1);
		System.out.println("the rsult is :\t"+result1);
		
		// syntax of public int codePointBefore(int index)
		//code point before
		String text1 ="sskg";
		int result2 =text1.codePointBefore(2);
		System.out.println(result2);
		
		//Java String trim() Method
		
		String myStr ="      hello    ";
		System.out.println(myStr);
		System.out.println( "the string is:\t"+ myStr.trim());
		System.out.println(myStr.toString());
		
	 
		//converting string to an integer
		
		String str ="123";
		int num =100;
		
		int num2 =Integer.parseInt(str);
		
		int sum =num+num2;
		System.out.println("result is:"+sum );
		
		
		//converting  integer to string
		
		int num3  =10;
		int num4 =56;
		
		
		String num5 =Integer.toString(num3);
		String num6 =num5+num4;
		System.out.println("result is:"+num6 );
		
		//Java String compareTo() Method
		
		String myStr1 = "Hello";
	    String myStr2 = "Hellosai";
	    System.out.println(myStr2.compareTo(myStr1));
	    System.out.println(myStr2.equals(myStr2));
	    
	    
	    
	    
	    
		
		
	}

}
