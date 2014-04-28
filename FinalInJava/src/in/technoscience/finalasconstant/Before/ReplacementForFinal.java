package in.technoscience.finalasconstant.Before;

public class ReplacementForFinal {

	/** A string constant */

	public final static String A_STRING = "I Am Java Developer";

	/** An int constant. */

	public final static int AN_INT_Type = 51;

	/** A double constant. */

	public final static double A_DOUBLE_Type = 12.55d;

	/** An array constant. */

	public final static int[] AN_ARRAY_Type = new int[] { 1, 2, 3, 6, 9, 18, 36 };

	/** A color constant. */

	public final static Color A_COLOR = new Color(45, 0, 155);

	public void someMethod() {

		System.out.println(A_STRING);

		System.out.println(AN_INT_Type);

		System.out.println(A_DOUBLE_Type);

		System.out.println(AN_ARRAY_Type);

		System.out.println(A_COLOR);

	}
	

}
