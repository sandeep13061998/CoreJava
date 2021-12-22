package HashMap;

import java.util.HashMap;

public class FindKeysInHashMap {

	public static void main(String[] args) {
		
		
		// Check if a particular key exists in HashMap..
		// Create a HashMap Object
		
		HashMap<Integer,String> sports=new HashMap<Integer,String>();
		//Adding the elements to the Hashmap
		 
		sports.put(11,"Cricket");
		sports.put(12,"Football");
		sports.put(13,"BaseBall");
		sports.put(14,"Hockey");
		sports.put(15,"Rogby");
		
	//Checking Key Existence	
	//Whether 11 is present
		
		boolean variable= sports.containsKey(11);
		System.out.println("key 11 is exists in HashMap ?:" +variable);

		//Wheater 12 is present
		boolean var= sports.containsKey(12);
		System.out.println("key 12 is exists in HashMap ?:" +var);

		//wheather 18 is present
		
		boolean va= sports.containsKey(18);
		System.out.println("key 18 is exists in HashMap ?:" +va);
	System.out.println("*************");
	
	//Checking value Existence
	
	boolean variabl= sports.containsValue("Cricket");
	System.out.println("key Cricket is exists in HashMap ?:" +variabl);
	
	// whether 12 is present
	
	boolean variab= sports.containsKey("Hockey");
	System.out.println("key Hockey is exists in HashMap ?:" +variab);
	
	//Whether 14 is present
	boolean vari= sports.containsKey("BaseBall");
	System.out.println("key BaseBall is exists in HashMap ?:" +vari);
	
	//wheather 18 is present
	boolean variablee= sports.containsKey("Football");
	System.out.println("key Football is exists in HashMap ?:" +variablee);
	
	
	
	
	
	
	
	
	
	
	}

}
