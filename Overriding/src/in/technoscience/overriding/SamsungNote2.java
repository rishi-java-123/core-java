package in.technoscience.overriding;

import java.io.FileNotFoundException;

public class SamsungNote2 {

	public void openInNote2() {
		System.out.println("you are using note2");
	}

	protected void playWithNote2(String whatToPlay) {
		System.out.println("you are playing with argumented method");
	}

	public Object note2Feature() {
		System.out.println("i will deal with covariant return ");
		return null;
	}

	public void exceptionInNote2() throws IllegalAccessException {
		System.out.println("i will explain exception");
	}

	public void ExceptionalException() throws Exception {
		System.out.println("i behave different in polymorphism condition");
	}

}
