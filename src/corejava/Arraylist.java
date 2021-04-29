package corejava;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
	
	
  public static void main(String []args) {
	  
	ArrayList<String>  cars =new ArrayList<String>();
	cars.add("audi");
	cars.add("benz");
	cars.add("skoda");
	cars.add("honda");
	
	
	System.out.println(cars);
	  
	
	//To access an element in the ArrayList, use the get() method and refer to the index number:
	ArrayList<String>  cars1 =new ArrayList<String>();
	cars1.add("audi");
	cars1.add("benz");
	System.out.println("the first car is \n"+cars1.get(0));
	
	
	
	ArrayList<Integer>  numbers =new ArrayList<Integer>();
	numbers.add(30);
	numbers.add(20);
	numbers.add(40);
	numbers.add(10);
	//sort an arraylist
	
	Collections.sort(numbers);
	for(int i =0; i<=4; i++) {
		
		System.out.println( "\n the numbers are:\n"+numbers);
	}
	
	
	 
	
	
 	
	
	 
	
	

	
	
  }

}
