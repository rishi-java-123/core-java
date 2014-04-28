package in.technoscience.finalreference;

class Testing {
	int wilChange = 20;
	private int willChange;

	public static void main(String args[]) {
		final Testing t = new Testing();
		t.willChange = 30;
		System.out.println(t.willChange);
	}
}