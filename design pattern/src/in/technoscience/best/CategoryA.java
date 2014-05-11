package in.technoscience.best;

public class CategoryA implements SalaryCalculator {
	double baseSalary;
	double overTime;

	public CategoryA(double base, double overTime) {
		baseSalary = base;
		overTime = this.overTime;
	}

	public double getSalary() {
		return (baseSalary + overTime);
	}
}
