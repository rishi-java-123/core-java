package in.technoscience.inheritance;

// subclass of Parentclass
public class ChildClass extends ParentClass {

	// same variable name as present in superclass
	int b = 30;

	// new variable of sub class
	int c = 40;

	// overridden method
	public void m2() {
		System.out.println("i am in m2 method of child class");
	}

	// new method of subclass
	public void m3() {
		System.out.println("i am in m3 method of child class");

	}

	// method hiding.
	public static void writeCount() {
		System.out.println("Number of visit from subclass: " + noOfVisit);
	}

	// here compiler complains in term of accessibility and
	// don't consider as new method of subclass
	/*
	 * static void display() { System.out.println("from child class"); }
	 */
	// here we used public accessifier now compiler is happy and considering as
	// new method of subclass
	public static void display() {
		System.out.println("static method from child class");
	}
	// final method can not be overridden but can be inherited
	/*
	 * public final void finalMethod(){
	 * System.out.println("i am final method of sub class"); }
	 */

}
