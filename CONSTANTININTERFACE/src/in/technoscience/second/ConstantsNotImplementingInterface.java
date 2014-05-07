package in.technoscience.second;
public class ConstantsNotImplementingInterface
{
    public static void main (String args[])
    {
	// Just access some of the constants.
	System.out.println ("second_constant = " + ConstantsInInterface.second_Constant);
	System.out.println ("third_constant " + ConstantsInInterface.third_constant);

	// If "DEBUG" is false, the compiler will collapse out the
	// entire guarded statement.
	if (ConstantsInInterface.DEBUG)
	    System.out.println ("I'm here!!!");
    }
}