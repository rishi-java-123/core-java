package in.technoscience.finalreference;

class ExerciseTest {
	public static void main(String args[]) {
		final int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 10, 20, 30, 40, 50 };
		arr2 = arr1;
		//arr1 = arr2; // here compiler will say remove final from arr1.
		for (int i = 0; i < arr2.length; i++)
			System.out.println(arr2[i]);
	}
}