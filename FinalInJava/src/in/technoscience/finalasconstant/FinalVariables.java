package in.technoscience.finalasconstant;

public class FinalVariables {
	public static String someMethod(final String environmentVariable){
		final int variable= 15;
		System.out.println(variable);
		final String pathVariable= "env."+environmentVariable;
		System.out.println("pathVariable is::"+pathVariable);
		return (System.getProperty(pathVariable));
	}

}
