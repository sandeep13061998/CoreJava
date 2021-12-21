package Collections_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListSynchronized {

	public static void main(String[] args) {
		//Creating an arrayList
		//ArrayList <String> sync_coll = (ArrayList<String>) Collections.synchronizedList(new ArrayList<String>());
		//In order to synchronize the ArrayList
		//The best practice is make use of List instead of ArrayList
		List<String> sync_col = Collections.synchronizedList(new ArrayList<String>());
		//Adding an elements to the synchronized ArrayList
		sync_col.add("Phone");
		sync_col.add("Mobile");
		sync_col.add("Laptop");
		
		System.out.println("Iterating synchronized arrayList");
		synchronized(sync_col) {
			//We will use one more collection type : Iterator
			Iterator<String> iterator = sync_col.iterator();
			while(iterator.hasNext())
				System.out.println(iterator.next());  //This will read index by index...!!
		}
	}

}