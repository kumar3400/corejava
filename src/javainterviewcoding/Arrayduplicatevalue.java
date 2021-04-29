package javainterviewcoding;

public class Arrayduplicatevalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String sai[]= {"saik","kumar","saik","kumar"};
		
		
		int len=sai.length;
		
		
		for(int i=0;i<=len-1;i++) {
			
			for(int j=i+1; j<=len-1;j++) {
				
				
				if(sai[i].equals(sai[j])) {
					
					System.out.println("the duplicate value is:"+sai[i]);
				}
				
			}
		}
		
		
	}

}
