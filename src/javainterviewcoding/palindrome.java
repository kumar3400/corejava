package javainterviewcoding;

public class palindrome {
	
	
	
	
	 public static void main(String[] args) {
		
	
		
     int sum =0;
		
		int temp;
		
		int r;
		
		int num =453;
		
		
		temp =num;
		
		while(num>0) {
			
			r =num%10;//reminder 4
			sum =sum*10+r;
			
			num = num/10;//45
			
		}
		
		if(temp==sum) {
			
			System.out.println("palindrum number");
		}
		
		else {
			
			System.out.println("it is not palindrome");
		}
		
	}


}
