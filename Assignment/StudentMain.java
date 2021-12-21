package Assignment;

//import Assignment.Student.StudentMain;

public class StudentMain  
	{
		public static void main(String[] args)
		{
			Student student=new Student("sandeep",143,"CSE");
		    Address address=new Address("6-15","RKPUR","Telangana",506391);
		    System.out.println("===================================");
		    student.studentDetails();
		    System.out.println("===================================");
		    address.addressDetails();
		}
	    
	    
	


	}


