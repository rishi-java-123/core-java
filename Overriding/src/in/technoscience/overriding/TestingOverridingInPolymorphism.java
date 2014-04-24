package in.technoscience.overriding;

public class TestingOverridingInPolymorphism {
	
	public static void main(String[] args) {
		
		// reference type of super class and object creation of subclass
		//runtime polymorphism.
		SamsungNote2 sn4= new SamsungNote3();
		
		// due to polymorphism it will call the overriden method.
		sn4.openInNote2();
		sn4.playWithNote2("polymorphically");
		sn4.note2Feature();
		try {
			sn4.exceptionInNote2();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// in subclass method have not thrown any exception, but
		// compiler sees left side of assignement operator and 
		//still thinks that we want to call method of super class
		//so suggest us to handle the exception.
		
		//sn4.ExceptionalException();
		
		try {
			sn4.ExceptionalException();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
