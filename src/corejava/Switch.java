package corejava;

public class Switch {
	public static void main(String args[]) {
	int day = 4;
	switch (day) {
	  case 1:
	    System.out.println("Monday");
	    break;
	  case 2:
	    System.out.println("Tuesday");
	    break;
	  case 3:
	    System.out.println("Wednesday");
	    break;
	  case 4:
	    System.out.println("Thursday");
	    break;
	  case 5:
	    System.out.println("Friday");
	    break;
	  case 6:
	    System.out.println("Saturday");
	    break;
	  case 7:
	    System.out.println("Sunday");
	    break;
	}
	// Outputs "Thursday" (day 4)
	//When Java reaches a break keyword, it breaks out of the switch block.


	
     int days =7;
     switch(days) {
     case 1:
    	 System.out.println("Monday");
 	    break;
 	  case 2:
 	    System.out.println("Tuesday");
 	    break;
 	  case 3:
 	    System.out.println("Wednesday");
 	    break;
 	  case 4:
 	    System.out.println("Thursday");
 	    break;
 	  case 5:
 	    System.out.println("Friday");
 	    break;
 	  case 6:
 	    System.out.println("Saturday");
 	    break;
 	    
 	    default:
 	    	 System.out.println("sunday is missing");
    	 
     
     
     
     }
     //The continue keyword can be used in any of the loop control structures. It causes the loop to immediately jump to the next iteration of the loop.
     
     int []numbers = {10,20,30,40,50};
     
     for(int x :numbers) {
    	 
    	 if (x==30) {
    		 
    		 continue;
    	 }
    		 
    		 System.out.println(x);
    		// System.out.println("\n");
    		 
    	 }
     }
     
     
	
}

