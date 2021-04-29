package corejava;

public class ConditionalLoops {
	
	public static void main(String []args) {
		
		for( int i = 0;i<=7;i++) {
			
			System.out.println("the value of i ="+i);
			
			
		}
		
		for(int i =1;i<=5;i=i+2) {
			
			System.out.println("\n" +i);
		}
		
		//For-Each Loop
		/*for (type variable : arrayname) {
			  // code block to be executed
			}*/
		
		String[]  cars = {"volvo","benz","audi","bmw"};
		
		
		//int len =cars.length;
		
		for(String i : cars) {
			
			System.out.println(i);
			
			
		}
		//while loops
		int i=0;
		while(i<5){
			System.out.println("sai value is :"+i);
			
			if(i==2) {
				
				System.out.println("the correct one is"+i);
				break;
			
			}
			
			i++;
			
			
			
			
		}
		
		
		int k=1;
		
		while(k<6) {
			
			System.out.println("\n"+ "the k value is : "+k);
			k++;
		}
		
		
		int a[]  = new int[4];
		 a[0]=24;
		 a[1]=1;
		 a[2]=23;
		 a[3]=24;
		 
		  
		
	    for(i=0;i<=3;i++) {
	    	
	    	System.out.println("the value is:"+ a[i]);
	    	
	    	
	    	System.out.println("saikumar.ksheerasagar@gmail.com");
	    	
	    }
		
		
		
		
	
	//do while loops 
	
			int j=0;
			
			do {
				System.out.println(j);
				j++;
				
			}
			while(j<5);
			

}
}
