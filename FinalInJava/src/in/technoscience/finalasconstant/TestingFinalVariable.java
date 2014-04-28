package in.technoscience.finalasconstant;

public class TestingFinalVariable {
	public static void main(final String[] args) {
		System.out
				.println("note the change in path variable after method invocation:");
		FinalVariables.someMethod("JAVA_HOME");
		FinalVariables.someMethod("MAVEN_HOME");

	}

}
