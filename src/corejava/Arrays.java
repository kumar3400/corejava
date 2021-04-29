package corejava;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		cars[3]="mazda";
	    System.out.println(cars[3]);
	    
	    //Change an Array Element
	    String[] Bus  = {"Hyderabad", "jangaon","nalgonda","nizamabad"};
	    
	            
	  /*  for(int i=0;i<Bus.length;i++) {
	    	
	    	System.out.println(Bus[i]);
	    }
	    */
	    
	   Bus[2] ="bangalore";
	    System.out.println("\n"+Bus[2]);
	    
	    
	    //Loop Through an Array
	    
	    String[]  bikes = {"honda","shine","bajaj","pulsar"};
	    
	    for(int k = 0;k<bikes.length;k++) {
	    	System.out.println(bikes[k]);
	    	
	    	
	    }
	    //Multidimensional Arrays
	    
	    int [][]  mynumbers = {{1,2,3,4,},{5,6,7}};
	    int x =mynumbers[1][2];
	    
	    System.out.println("multidimensional array is:"+x);
	    
	    
	    
        //Array Length
		
	String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};
	System.out.println(cars1.length);
	
	
	//Loop Through an Array with For-Each
	
	String[]  bikes1 = {"bajaj","pulser","hero"};
	for (String i :bikes1) {
		System.out.println("the bikes is:"+i);
	}
		
		int[] z = new int[10];
	    z[0] = 22;
	    z[1] = 23;
	    z[2] = 23;
	    z[3] = 28;
	    z[4] = 28;
	    z[5] = 23;
	    z[6] = 24;
	    z[7] = 25;
	    z[8] = 26;
	    z[9] = 29;
	    //z[10]=30;java.lang.ArrayIndexOutOfBoundsException: 10
	    System.out.println("the value:"+z[8]);
	    
	    for(int j =0; j<9;j++) {
	    	
	    	System.out.println(z[j]);
	    }
	    
	    
	    
	    
	     
	      
		
		
		
	
	    
	}
     

}
