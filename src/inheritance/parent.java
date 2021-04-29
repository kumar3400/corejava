package inheritance;

public class parent  {
	
	 public static  int a =10;
	public void print() {
		
		System.out.println("parent");
		
		Bus bus = new Bus();
		bus.show();
	}

	
	public  void name(String name) {
		
		System.out.println(name);
	}
	
	
	public void school(String school) {
		
		
		System.out.println(school);
	}
}
