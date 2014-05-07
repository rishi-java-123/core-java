package in.technoscience.first;
public class ConstantImplementingInterface implements ConstantsInInterface
{
    public static void main (String args[])
    {
	// Just access some of the constants.
	System.out.println ("Second_constant = " + second_Constant);
	System.out.println ("third_constant " + third_constant);

	// If "DEBUG" is false, the compiler will collapse out the
	// entire guarded statement.
	if (DEBUG)
	    System.out.println ("I'm here!!!");
    }
}