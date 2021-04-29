package AjayPractice;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] name = {"sai","naresh","kumar","llf"};
		
		int len =name.length;
		//for loop
		
		for(int i=0; i<len;i++ ) {
			
			System.out.println("the name is:"+name[i]);
		}
		
		
		//for each loop
		
		for(String i :name) {
			
			System.out.println(i);
		}

	}

}
