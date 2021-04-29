package javainterviewcoding;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> tvseries =new ArrayList<String>();
		tvseries.add("big boss");
		tvseries.add("game of thrones");
		tvseries.add("the walking bead");
		tvseries.add("the machine impossible");
		tvseries.add("Breaking Bad");
		
		System.out.println(tvseries.get(2));
		System.out.println("the tv series is"+tvseries);

		
		//1.using java8 with for each loop and lambda expression
		System.out.println("print using for each loop");
		tvseries.forEach(shows->{
			
			System.out.println(shows);
				
		});
		
		
		System.out.println("----------------------");
		
		//2.using iterator
		System.out.println("print using iterator");
		 Iterator<String> it = tvseries.iterator();
		 
		 while(it.hasNext()) {
			 
			 String shows = it.next();
			 
			 System.out.println(shows);
		 
		}
		 
		 //3.using for each loop
		 System.out.println("using for each loop");
		 for(String show:tvseries) {
			 
			 System.out.println(show);
		 }
		 
		 //4.using for loop with order/index
		 
		 for(int i =0; i<tvseries.size();i++) {
			 
			 System.out.println(tvseries.get(i));
		 }
	}

}
