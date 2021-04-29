package javainterviewcoding;

public class FindtheMissingnumber {

	
	
	public static void main (String []args) {
	int a[] = {1,2,4,5};
	
	int sum =0;
	
	int len =a.length;
	
	
	for(int i =0;i<=len-1;i++) {
		
		sum = sum+a[i];
	}
	
	System.out.println(sum);
	
	int sum1 =0;
	
	for(int j=1;j<=5;j++) {
		
		
		sum1 = sum1+j;
			
		
	}
	System.out.println(sum1);
	
	System.out.println("the missing number of array is:"+(sum1-sum) );
}
}