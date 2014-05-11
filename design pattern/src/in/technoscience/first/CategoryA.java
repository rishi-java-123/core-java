package in.technoscience.first;

public class CategoryA {
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
