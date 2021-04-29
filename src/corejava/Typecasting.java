package corejava;

/*In Java, there are two types of casting:

Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte*/


public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //widening casting
		int x=9;
		double mydouble =x;//automatic casting int to double
		
		System.out.println("value of x : "+  x);
		System.out.println("value of double:"+   mydouble);
		
		//narrow casting
		double myDouble = 9.78;
	    int myInt = (int) myDouble; // Manual casting: double to int

	    System.out.println(myDouble);   // Outputs 9.78
	    System.out.println(myInt);  //output 9

		
		
	}

}
