package corejava;

import java.util.Scanner;

//The Scanner class is used to get user input, and it is found in the java.util package.

/*nextBoolean()	Reads a boolean value from the user
nextByte()	Reads a byte value from the user
nextDouble()	Reads a double value from the user
nextFloat()	Reads a float value from the user
nextInt()	Reads a int value from the user
nextLine()	Reads a String value from the user
nextLong()	Reads a long value from the user
nextShort()	Reads a short value from the user
*/




public class Scannerclass {
	
	public static void main(String args[]) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("enter user name,age and salary");
		
		//string input
		String username = obj.nextLine();//read user input
		System.out.println("user name is:"+username);
		
		//int input
		int  age =obj.nextInt();
		System.out.println("age is:"+age);
		
		
		//double input
		
		double value = obj.nextDouble();
		System.out.println("value is:"+value);
		
		
		

		
		
		
		
		
		
		
		
	}

}
