package Assignment;

public class Staff {
		//Declaring Staff variables
		String Name;
		String Dept;
		String Subject;
		//Creating Constructor for Initialization
		public Staff(String name, String dept, String subject) {
			super();
			Name = name;
			Dept = dept;
			Subject = subject;
		}
		//Creating method
		void staffDetails()
		{
			System.out.println("=========================================");
			System.out.println("===========Staff Details=================");
			System.out.println("=========================================");
			System.out.println("Staff Name: "+Name);
			System.out.println("Staff Department: "+Dept);
			System.out.println("Staff Major Subject: "+Subject);
		}
	}
	class College
	{
		//Declaring College Variables
		String college_name;
		int no_of_depts;
		int students_strength;
		int no_of_employees;
		String college_city;
		//Creating Constructor for initialization
		public College(String collegename, int noofdepts, int studentsstrength, int noofemployees,String collegecity) {
			super();
			this.college_name = collegename;
			this.no_of_depts = noofdepts;
			this.students_strength = studentsstrength;
			this.no_of_employees = noofemployees;
			this.college_city=collegecity;
		}
		//Creating method
		void collegeDetails()
		{
			System.out.println("========================================");
			System.out.println("============College Details=============");
			System.out.println("========================================");
			System.out.println("College Name is: "+college_name);
			System.out.println("No Of Departments in college: "+no_of_depts);
			System.out.println("No Of students in college: "+students_strength);
			System.out.println("No of Employees in college: "+no_of_employees);
			System.out.println("College City: "+college_city);
		}
	}
	 