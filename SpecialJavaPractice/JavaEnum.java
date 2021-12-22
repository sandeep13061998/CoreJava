package SpecialJavaPractice;

enum day{
	   SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY,SATURDAY;

}

public class JavaEnum {

day Day; //Enum Object
//constructor
public JavaEnum(day Day) {
	this.Day=Day;
}
//creating a method to check the condition
public void dayIsLike() {
	switch(Day) {
	case  MONDAY:
		System.out.println("Monday are bad");
		break;
	case  TUESDAY:
		System.out.println("Tuesday are Better");
		break;
	case  FRIDAY:
		System.out.println("Friday are fun");
		break;
	case  SATURDAY:
		System.out.println("Saturday are Enjoy");
		break;
	case  SUNDAY:
		System.out.println("Sunday are WEEKEND");
		break;
	
		default:
			System.out.println("MIDWEEK days are okay...okay...!");
			
	}
}
	
	
	public static void main(String[] args) {
	 
		String str="SUNDAY";
		JavaEnum Jenum=new JavaEnum(day.valueOf(str));
		Jenum.dayIsLike();

	}

}
