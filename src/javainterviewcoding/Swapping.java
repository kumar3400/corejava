package javainterviewcoding;

public class Swapping {
	
	
	public static void main(String args[]) {
		
		
		int x =5;
		int y =10;
		
		int temp;
		
		//with using temp variable
		
		 temp =x;//5
		 
		 x=y;//10
		 y=temp;//5
		 
		 
		 System.out.println(x);
		 System.out.println(y);
		 
		 
		 //with out using third variable using + operator
		 int a =10;
		 
		 int b=5;
		 
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 
		 
		 System.out.println(a);
		 System.out.println(b);
		 
		 //using * operater
		 
		 a=a*b;
		 b=a/b;
		 a=a/b;
		 
		 System.out.println(a);
		 System.out.println(b);
		 
		 
		 //swap  strings with out using temp/third variable
		 
		 String A ="hello";
		 
		 String B="world";
		 
		 System.out.println("befor swapping is the vale of A:"+A);
		 System.out.println("before swapping the value of B:"+B);
		 
		 A=A+B;//helloworld 
		 B=A.substring(0,A.length()-B.length());
		 A=A.substring(B.length());
		 
		 System.out.println("after swapping the value of A is:"+A);
		 System.out.println("after swapping the value of B is:"+B);
		 
		 


		 
	}

}
