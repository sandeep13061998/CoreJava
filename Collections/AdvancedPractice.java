package Collections;

import java.util.ArrayList;

public class AdvancedPractice {
	
	//Using a loop can we add element to the arrayList
	//Java program to create a brand new arrayList using Loop
	

	public static void main(String[] args) {
	
	//For Loop
		//We had created an array object to store the element into it
		
ArrayList<Integer> numbers=new ArrayList<Integer>();


for(int i=0;i<numbers.size();i++) {
	//we need to add the element to ArrayList
	numbers.add(0,10);
	numbers.add(1,20);
	numbers.add(2,30);
	numbers.add(3,40);
	numbers.add(4,50);
	
}
System.out.println("Elements of an array are:" +numbers);

	}

}
