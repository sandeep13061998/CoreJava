package Collections;

import java.util.ArrayList;

public class ArrayListInJava {

	public static void main(String[] args) {
		
		//we had created an arrayList
		
		ArrayList<String> Names= new ArrayList<String>();
		
		Names.add("sandeep");
		Names.add("Java");
		Names.add("Programming");
		Names.add("ArrarList");
		Names.add("Banglore");
		
		//Displaying the array elements
		
	System.out.println("Array Elements are: "+Names);
		
	Names.add(5,"onePlus");
	System.out.println("New elements added and the array is: ");
	System.out.println(Names);
	
	//We can change the elements of arrays at any moment of time.
	Names.add(3,"Techincal");	
	System.out.println("new element is been changed at position no.3");
	System.out.println(Names);
	// In order to remove any element from the array
			Names.remove(4);
			System.out.println("List elements after removing 'ArrayList' : ");
			System.out.println(Names);
			System.out.println("Below element present at the 0,1,2,3,4th position in the array list");
			System.out.println(Names.get(0));
			System.out.println(Names.get(1));
			System.out.println(Names.get(2));
			System.out.println(Names.get(3));
			System.out.println(Names.get(4));
			
			//Loop : for loop :  foreach
			System.out.println("This is from advanced loop");
			for(int i=0; i<Names.size();i++)
				System.out.println(Names.get(i));
			System.out.println("This is from ForEachLooop");
			for(String object : Names)
				System.out.println(object);

	}

}
