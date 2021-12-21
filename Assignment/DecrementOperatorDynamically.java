package Assignment;
import java.util.Scanner;


public class DecrementOperatorDynamically {

	public static void main(String[] args) {
		int let, say;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number let");
		let=sc.nextInt();
		
		//System.out.println(let);
		System.out.println("enter the number say");
		say=sc.nextInt();
		
		//System.out.println(say);
		let--;
		say--;
		System.out.println(let--);
		System.out.println(say--);
	
	System.out.println("======");
	

	}

}
