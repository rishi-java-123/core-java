package in.technoscience.overriding;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class SamsungNote3 extends SamsungNote2 {

	// method being overridden
	@Override
	public void openInNote2() {
		// if you wish to call method of super class first then back to subclass
		super.openInNote2();
		System.out.println("i m in note 3");
	}

	/*
	 * while overriding changing the argument type if we change the argument
	 * type then it will not be overridden method it will become new method for
	 * subclass
	 */
	/*
	 * @Override protected void playWithNote2(int whatToPlay) {
	 * 
	 * }
	 */

	/*
	 * // here focus on accessifier //in super class we have used protected but
	 * while //overridding public and its alryt, so it satisfy accessifier rule
	 * .
	 */
	@Override
	public void playWithNote2(String whatToPlay) {
		System.out.println("i am overriden properly in note3");
	}

	/*
	 * // now using higher restriction // compiler is angry now...show red red..
	 * 
	 * @Override private void playWithNote2(String whatToPlay) { // TODO
	 * Auto-generated method stub super.playWithNote2(whatToPlay); }
	 */

	// focus on return type
	// in superclass return type is object,here string and compiler is happy

	@Override
	public String note2Feature() {
		System.out
				.println("covariant return ==> as String is subclass of Object so allow");

		return "happy";
	}

	/*
	 * // focus on Exception // superclass throws checked exception and here
	 * this throw runtimeexception== compiler happy
	 */
	@Override
	public void exceptionInNote2() throws ArithmeticException {
		System.out.println("i am in note 3 exception");

	}

	@Override
	public void ExceptionalException() {
	System.out
	.println("i will be called afther handling the exception,if not handled compilere thinks about superclass only note2!");
	}

	/*
	 * // comliper is angry now, //in subclass we are trying to throw new
	 * checked exception and //this is not allowed
	 * 
	 * @Override public void exceptionInNote2() throws SQLException { // TODO
	 * Auto-generated method stub super.exceptionInNote2(); }
	 */

	// here compiler is again angry
	// we are trying to throw exception higher in hierarchy than exception
	// thrown in
	// superclass method

	/*
	 * @Override public void exceptionInNote2() throws Exception { // TODO
	 * Auto-generated method stub super.exceptionInNote2(); }
	 */

}
