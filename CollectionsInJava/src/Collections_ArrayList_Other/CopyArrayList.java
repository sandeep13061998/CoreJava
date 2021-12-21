package Collections_ArrayList_Other;

import java.util.ArrayList;

public class CopyArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> array_one= new ArrayList<Integer>();

		array_one.add(10);
		array_one.add(20);
		array_one.add(30);
		array_one.add(40);
		array_one.add(50);
		System.out.println("The 1st ArrayList is:"+array_one);
		
	//create other object
		
		ArrayList<Integer> array_two= new ArrayList<Integer>();
		
		array_two.add(60);
		array_two.add(70);
		array_two.add(80);
		System.out.println("The 2nd Arraylist is:"+array_two);
		
		//copy the One Arraylist to Other Arraylist
		array_one.addAll(array_two);
		System.out.println("after Updataing the Array");
		
		System.out.println(array_one);
		
	}

}
