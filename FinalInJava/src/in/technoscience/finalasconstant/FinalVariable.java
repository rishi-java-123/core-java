package in.technoscience.finalasconstant;

public class FinalVariable {

	public static String wrongMethod(final String environmentVariable){
		final String path="Path_Variable :"+environmentVariable;
		System.out.println("path variable is:"+path);
	//	path= new String("may be different value"); compiler unhappy
		return System.getenv(path);
	}
}
