package corejava;

public class Wrapperclasses {
	
	public static void main(String []args) {
		
		String x="100";
		System.out.println(x+20);
		
		//data convetion string to integr 
		
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		
		//string to double conversion
		
		String y = "12.33";
		
		double d=Double.parseDouble(y);
		System.out.println(d+10);
		
		
		//string to boolean
		
		String k = "true";
		
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		
		//int to string conversion
		
		int j = 200;
		
		System.out.println(j+20);
		
		String s =String.valueOf(j);
		System.out.println(s+j);
		
		/*String u ="100A";
		Integer.parseInt(u);//NumberFormatException: For input string: "100A"
		*/
	}

}
