package Collections;

import java.util.ArrayList;

public class ArrayListAdd_Method {

	public static void main(String[] args) {

		// String[] array=
		// Str{10,20,30,40,"banglore","INR","Crypto","ShareMarket",30.0,20.09};
		// ArrayList===>Integer, String and double..!

		ArrayList<Object> array_str = new ArrayList<Object>();

		array_str.add("Wipro");
		array_str.add(60);
		array_str.add("Capgemini");
		array_str.add(70);
		array_str.add("Infosys");
		array_str.add(80);
		array_str.add("TechM");
		array_str.add(90);
		System.out.println("Element of array_str of string type:" + array_str);
		System.out.println("*************************");

		// Create another an arraylist
		ArrayList<Integer> array_int = new ArrayList<Integer>();
		array_int.add(10);
		array_int.add(20);
		array_int.add(30);
		array_int.add(40);
		System.out.println("Elements of Array_int of string type : " + array_int);
		array_str.addAll(array_int);
		System.out.println("Elements after adding the string type and string integer" + array_str);

	}
}
