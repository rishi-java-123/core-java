package in.technoscience.inheritance;

public class ParentClass {
	// instance methods with package level accessifier
	int a = 100;

	int b = 200;
    // static variable
	private static int noOfTimes;
	public static int noOfVisit;
	
	//private instance variable
	private boolean indicator;
	protected String name;
	
	
	// constructor
	public ParentClass() {
		
		indicator = true;
		name = "parent class";
		noOfTimes++;
		}
	
   // instance methods
	public void m1() {
		System.out.println("i am in m1 method of parent class");
	}

	public void m2() {
		System.out.println("i am in m2 method of parent class");

	}

	// static method accessing private variables
	public static void writeCount() {
		System.out.println("Number of times from super class: " + noOfTimes);
	}
	
	//normal static method
	public static void display()
	{  
		System.out.println("static method from parent class ");
	
	}
	
	//final method
	public  final void finalMethod(){
		System.out.println("i am final method of super class");
	}

}
