package Assignment;

public class WeightMechine {

	

			//Declaring Variables
				String name;
				String colour;
				double capacity;
				//Creating Constructor
				public WeightMechine(String name, String colour, double capacity) {
					super();
					this.name = name;
					this.colour = colour;
					this.capacity = capacity;
				}
				//Creating Method
				void WeighingMachine()
				{
					System.out.println("WeightMechine Name: "+name);
					System.out.println("WeightMechine colour: "+colour);
					System.out.println("WeightMechine capacity: "+capacity);
				}
				public static void main(String[] args) 
				{
					//Creating Objects for class
					WeightMechine obj1=new WeightMechine("Hesley","Black",800);
					WeightMechine obj2=new WeightMechine("Vandley","Blue",400);
					WeightMechine obj3=new WeightMechine("Rylan","Brown",2000);
					//Invoking or calling methods
					System.out.println("*************************");
					obj1.WeighingMachine();
					System.out.println("*************************");
					obj2.WeighingMachine();
					System.out.println("*************************");
					obj3.WeighingMachine();
					System.out.println("*************************");
					
				}
				

			
	}


