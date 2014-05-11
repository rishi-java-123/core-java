package in.technoscience.best;

public class CategoryB implements SalaryCalculator {
	double salesAmount;
	double baseSalary;
	final static double commission = 0.02;

	public CategoryB(double sa, double base) {
		baseSalary = base;
		salesAmount = sa;
	}

	public double getSalary() {
		return (baseSalary + (commission * salesAmount));
	}
}
