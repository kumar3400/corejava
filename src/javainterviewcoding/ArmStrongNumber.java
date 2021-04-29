package javainterviewcoding;

public class ArmStrongNumber {
	//153 = 1*1*1 =1
			//5*5*5 =125
			//3*3*3 =27
	

	
	public static void Armstrangnum(int num) {
		
		  int cube=0;
		   int r;
		   int temp;
		   
		   
		   temp = num;
		   
		   while(num>0) {
			   
			   r=num%10;
			   num =num/10;
			   cube=cube+(r*r*r);
			   
		   }
		   
		   
		   if(temp==cube) {
			   
			   
			   System.out.println("this is armstrang number");
		   }
		   
		   else {
			   
			   System.out.println("this is not armstrong number");
			   
		   }
		   
		   
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Armstrangnum(153);
		
		

	}

}
