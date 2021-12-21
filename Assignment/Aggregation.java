package Assignment;

public class Aggregation {

	public static void main(String[] args) {
		//Creating Objects for Both Staff and College
				Staff Object1=new Staff("sandeep","CSE","M1");
				College Object2=new College("JITS",4,1600,150,"WgL");
				//System.out.println("===============================");
				//Invoking/Calling Staff_Details method
				Object1.staffDetails();
				//Invoking/Calling College_Details method
				Object2.collegeDetails();

	}

}
