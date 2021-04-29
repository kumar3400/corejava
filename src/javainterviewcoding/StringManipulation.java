package javainterviewcoding;

public class StringManipulation {
	
 	public static void main(String args[]) {
		
		String str = "The rains have started here";
		String str1 = "The rains Have started here";


		System.out.println(str);
		
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf('s'));
		//System.out.println(str.indexOf('t',str.indexOf('t')+1));
		
		System.out.println(str.indexOf("have"));
		
		
		//string comparision
		System.out.println(str.equals(str1));
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		//substring
		
		System.out.println(str.substring(0,8));
		
		//trim
		
		String s ="  hello  world   ";
		System.out.println(s.trim());
		
		
		//replace 
		
		String st = "sai";
		
		System.out.println(st.replace("sai","kumar"));
		
		String date ="01-01-2019";
		System.out.println(date.replace("-", "/"));
		
		 
		//split
		
		String test ="hello_world_Test_selenium";
		
		String testval[]=test.split("_");
		
		for(int i =0; i<testval.length; i++) {
			
			System.out.println(testval[i]);
		}
		
		
		//string cancatination
		String s2="kumar";
		 String  s3="sai";
		 
		 int a=100;
		 int b=200;		 
		 System.out.println(s2.concat(s3));
		
		 
		 System.out.println(s2+s3);
		 System.out.println(a+b);
		 System.out.println(s2+s3+a+b);
		 System.out.println(s2+s3+(a+b));



		 
		 
		}
		
 		
		
	}


