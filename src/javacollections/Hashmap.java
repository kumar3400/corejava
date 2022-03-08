package javacollections;

import java.util.HashMap;

/*hash map It stores the data in (Key, Value) pairs. To access a value one must know its key. 
 * HashMap is known as HashMap because it uses a technique called Hashing.
 *  Hashing is a technique of converting a large String to small String that represents the same String. 
 */

public class Hashmap {
	
	private static final int HashMap = 0;
	private static final int String = 0;

	public static void main(String args[]) {
		
		HashMap<String,Integer>  map =new HashMap<String,Integer>();
		
		map.put("india",10);
		map.put("pakistan",20);
		map.put("austrailia",30);
		map.put("england",40);
		
		System.out.println(map);
		System.out.println(map.get("india"));
		System.out.println(map.get("pakistan"));
		
		
		HashMap<String, String> states = new HashMap<String,String>();
		states.put("telangana", "Hyederabad");
		states.put("karnataka", "Bangalore");
		states.put("kerala", "thiruvananthapuram");
		
		
		String telanganacapital = states.get("telangana");
		String karnatakacapital = states.get("karnataka");
		String keralacapital = states.get("kerala");
		
		System.out.println(telanganacapital);
		System.out.println(karnatakacapital);
		System.out.println(keralacapital);
		
		
		
		
		
		//String  map1 =  DataClass.getConfigData();
		
		 
		
	 
		HashMap<String, String> map1 = DataClass.getTestData();
		
		String username =map1.get("username");
		
		System.out.println(username);
	
		 
		
		
		



		
		
		
		
	}

}
