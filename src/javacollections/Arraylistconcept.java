package javacollections;

import java.util.ArrayList;

 
public class Arraylistconcept {

	public static   void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[3];//static array we cant declared in array list cause size is fixed
 //we use dynamic array for array list 
		
		//1.can contain duplicate values
		//2.maintain insertion order
		
		ArrayList	ar = new ArrayList();
		ar.add(10);//0
		ar.add(20);//1
		
		System.out.println(ar.size());
		ar.add(40);//2
		ar.add(50);//3
		ar.add(50);//4
		ar.add("sai");//
		ar.add(12.33);//we can declare any type prim or non primitive because this is  non genric 
		System.out.println(ar.size());//size of arraylist
		
		System.out.println(ar.get(2));//to get the value from index
		
		//to print the allthe values from arraylist we use forloop
		
		for(int i=0;i<ar.size();i++) {
			
			System.out.println("the array list value is:"+ar.get(i));
			
			
			//generic 
			
			ArrayList<Integer> ar1 = new ArrayList<Integer>();
			
			//ar1.add("sai") it wont add beacuse the array is declared integer this is called Generic
			
			ar1.add(100);
			ar1.add(200);
			
			ArrayList<String> ar2 = new ArrayList<String>();
			ar2.add("sai");
			ar2.add("kumar");
			
			
			
			
			 
			
			
			
		}


		
		
		
	}

}