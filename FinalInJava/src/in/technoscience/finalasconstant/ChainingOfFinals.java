package in.technoscience.finalasconstant;

public class ChainingOfFinals {
	public final String name;

	public final int nameLength = this.name.length();

	//public final int nameLength = name.length();// compiler unhappy

//	public final String anotherValue = name; // compiler unhappy

	public ChainingOfFinals(final String name) {

		this.name = name;

	}

}
