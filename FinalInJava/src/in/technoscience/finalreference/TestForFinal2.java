package in.technoscience.finalreference;

class TestForFinal2 {
	int iWillMakeUSuffer = 20;

	public static void main(String args[]) {
		final TestForFinal2 t1 = new TestForFinal2();
		TestForFinal2 t2 = new TestForFinal2();
		// t1 = t2;
		System.out.println(t1.iWillMakeUSuffer);
	}
}