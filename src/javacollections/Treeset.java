package javacollections;

import java.util.TreeSet;

/*
 * TreeSet is one of the most important implementations of the SortedSet interface in Java that uses a Tree for storage
 * TreeSet implements the SortedSet interface so duplicate values are not allowed.
      Objects in a TreeSet are stored in a sorted and ascending order.
 */

public class Treeset {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("E");
		ts.add("D");
		ts.add("C");
		ts.add("B");
		
		ts.add("E");//duplicate will not get insert
		
		
		// Elements get stored in default natural 
        // Sorting Order(Ascending) 
        System.out.println(ts); 
		
		


		
		
		

	}

}
