package corejava;

public class DecisionMaking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if statement
		
		int age =20;
		if(age<22) {
			
			System.out.println("1.true  the age is less than 22");
		}
		
		
		String name="saikumar";
		
		if(name=="sai") {
			
			System.out.println("false");
		}
		
		else {
			
			System.out.println("true");
		}
		
		
	
	//if-else statement
	
	int Age=17;
	
	if(Age<18) {
		
		System.out.println("2.age is mynor");
		
	}
	
	else {
		
		System.out.println("3.age is major");
		
	}
	
	//Java if-else-if ladder Statement
	
	int marks =55;
	
	if (marks<75) {
		
		System.out.println("fail");
		
	}
	else if(marks>75){
		System.out.println("pass");
		
		
	}
	else if(marks>=75) {
		
		
		System.out.println("comport mental");
	}
	else {
		System.out.println("absent");

	}
	
	//nested if statements
	
	 int age1=22;
	 int weight =75;
	 if(age1>18) {
		 if(weight>50) {
		 
			 System.out.println("you are eligible to donate blood");
	 }
	 
	   }else {
		   System.out.println("you are not  eligible to donate blood");
		   
	   }
	}
	
	 
	

}
