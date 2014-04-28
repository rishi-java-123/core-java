package in.technoscience.Array;

public class ExceptionInArray {

	public static void main(String[] args) {
		 int array[] = null;
         int sizeOfArray = 4;
         int includedArray = -0;
         int output;

		for (int i = 0; i < 6; i++) {

			try {

				// Multiple Switch Conditions

				switch (i) {

				case 0:

					output = array[0]; // Generates a NullPointerException.

					break;

				case 1:

					array = new int[includedArray]; // Generates a

					// NegativeArraySizeException.

					output = array[includedArray];

					break;

				case 2:

					array = new int[sizeOfArray ]; // Generate the

					// ArrayIndexOutOfBoundsException.

					output = array[sizeOfArray ];

					break;

				case 3:

					array = new int[5]; // Generate the

					// IndexOutOfBoundsException.

					output = array[5];

				case 4:

					Object newArray = new Integer(0); // Generate the

					// ClassCastException.

					System.out.println((String) newArray);

				case 5:

					Object X[] = new String[-5]; // Generate the

					// ArrayStoreException.

					X[0] = new Integer(0);

					System.out.println(X);

				}

			} catch (NullPointerException ex1) {

				System.out.println("\n Exception Generated: "

				+ ex1.getMessage());

				ex1.printStackTrace();

			} catch (NegativeArraySizeException ex2) {

				System.out.println("\n Exception Generated: "

				+ ex2.getMessage());

				ex2.printStackTrace();

			} catch (ArrayIndexOutOfBoundsException ex3) {

				System.out.println("\n Exception Generated: "

				+ ex3.getMessage());

				ex3.printStackTrace();

			} catch (IndexOutOfBoundsException ex4) {

				System.out.println("\n Exception Generated: "

				+ ex4.getMessage());

				ex4.printStackTrace();

			} catch (ClassCastException ex5) {

				System.out.println("\n Exception Generated: "

				+ ex5.getMessage());

				ex5.printStackTrace();

			} catch (ArrayStoreException ex6) {

				System.out.println("\n Exception Generated: "

				+ ex6.getMessage());

				ex6.printStackTrace();

			}

		}

	}

}
