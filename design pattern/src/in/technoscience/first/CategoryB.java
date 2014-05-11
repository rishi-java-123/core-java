package in.technoscience.first;
public class CategoryB {
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