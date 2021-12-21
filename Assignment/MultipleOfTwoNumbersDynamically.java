package Assignment;
import java.util.Scanner;

public class MultipleOfTwoNumbersDynamically {

	public static void main(String[] args) {
		int number_one,number_two,mul;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter first number: ");
		
		number_one=sc.nextInt();
		
		System.out.println("enter second number:");
	number_two=sc.nextInt();
		
		
		mul=number_one*number_two;
		System.out.println("multiple of these numbers is :" + mul);
		

	}

}
