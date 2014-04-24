package in.technoscience.overriding;

import java.io.FileNotFoundException;

public class Tsting {
	public static void main(String[] args) {

		// an object of subclass
		SamsungNote3 sn3 = new SamsungNote3();

		// check first are those methods inherited

		sn3.exceptionInNote2();

		sn3.openInNote2();
		sn3.note2Feature();
		sn3.playWithNote2("note3");

	}

}
