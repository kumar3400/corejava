package javacollections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Difference between List and Set in Java:
 *  . List is a type of ordered collection that maintains the elements in insertion order
 *   while Set is a type of unordered collection so elements are not maintained any order. 
 *  List allows duplicates while Set doesn't allow duplicate elements .
 */



/*The ArrayList class implements the List interface. It uses a dynamic array to store the duplicate element of different data types.
 *  The ArrayList class maintains the insertion order and is non-synchronized. The elements stored in the ArrayList class can be randomly accessed. 
 * Consider the following 
 */

public class Arraylist {
	
	public static void main (String args[]) throws IOException{
		
		ArrayList<String> list = new ArrayList<String>(); 
		
		
		list.add("sai");
		list.add("kumar");
		list.add("shruthi");
		list.add("ghanathe");
		list.add("kumar");

		System.out.println(list);
		 Iterator<String> itr = list.iterator();
		 
		 
		 
		 while(itr.hasNext()) {
			 
			 System.out.println(itr.next());
		 }
		
		//addAll()
  ArrayList<String> list1 = new ArrayList<String>(); 
		
		
		list1.add("sai");
		list1.add("kumar");
		list1.add("shruthi");
		list1.add("ghanathe");
		list1.add("kumar");

		
		for(int i =0; i<list1.size();i++) {
			
			System.out.println("the list of the values is:"+list1.get(i));
		}
		
		
			list.addAll(list1);
			
			for(int i=0;i<list.size();i++) {
				
				System.out.println(list.get(i));
			}
		 			
			
			 
			
			
	}
}

			
		
		
		


		
		
	


