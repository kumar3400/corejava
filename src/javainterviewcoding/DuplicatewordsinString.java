package javainterviewcoding;

public class DuplicatewordsinString {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String b = "Kumarsaiks";
		
		b=b.toLowerCase();
		
		
		String[] words =b.split("");
		
		int count ;
		
		for(int i=0; i<=words.length-1;i++) {
			
			
			count =1;
			
			
			for(int j=i+1;j<=words.length-1;j++) {
				
				if(words[i].equals(words[j])) {
					
					count++;
				}
				
			}
			
			if(count>1) {
				
				
				System.out.println(words[i]);
			}
		}

		 
		  
	}
}
