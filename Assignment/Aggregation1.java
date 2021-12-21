package Assignment;
public class Aggregation1 
	{
		public static void main(String[] args)
		{
			Student student=new Student("Naveen kumar",305,"Mechanical");
		    Address address=new Address("2-167","Asupaka","Telangana",507301);
		    System.out.println("===================================");
		    student.studentDetails();
		    System.out.println("===================================");
		    address.addressDetails();
		}
	    
	    
	}
