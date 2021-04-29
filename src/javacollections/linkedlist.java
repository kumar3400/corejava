package javacollections;

import java.util.Iterator;
import java.util.LinkedList;



/*
 * Difference between List and Set in Java:
 *  . List is a type of ordered collection that maintains the elements in insertion order
 *   while Set is a type of unordered collection so elements are not maintained any order. 
 *  List allows duplicates while Set doesn't allow duplicate elements .
 */


/*LinkedList implements the Collection interface. It uses a doubly linked list internally to store the elements. It can store the duplicate elements.
 *  It maintains the insertion order and is not synchronized.  In LinkedList, the manipulation is fast because no shifting is required.
 */

public class linkedlist {
	
	
	public static void main(String args[]) {
		
		LinkedList<String> list =new LinkedList<String>();
		
		list.add("A");
		list.add("B");
 		list.addLast("C"); 
		list.addFirst("D"); 
		list.add(2, "E"); 
		list.add("F"); 
		list.add("G"); 
        System.out.println("Linked list : " + list); 
        
        
        
        Iterator<String> itr = list.iterator();
        
        while(itr.hasNext()) {
        	
        	
        	System.out.println(itr.next());
        }
        
        
        
        
        
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        
        
        list1.add(3);
        list1.add(4);
        list1.add(2);
        list1.add(7);
        
        
        System.out.println(list1);
		
        
        // Removing elements from the linked list 
        list.remove("B"); 
        list.remove(3); 
        list.removeFirst(); 
        list.removeLast(); 
        System.out.println("Linked list after deletion: " + list); 
        
     // Get and set elements from linked list 
        Object element = list.get(2); 
        System.out.println("Element returned by get() : " + element); 
        list.set(2, "Y"); 
        System.out.println("Linked list after change : " + list); 
	}

}
