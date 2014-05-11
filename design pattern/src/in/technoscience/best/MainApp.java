package in.technoscience.best;

public class MainApp {
  public static void main(String [] args) {
    SalaryCalculator cA = new CategoryA(10000, 200);
    Employee emp = new Employee ("Jennifer",cA);
    emp.display();

    cA = new CategoryB(20000, 800);
    emp = new Employee ("Shania",cA);
    emp.display();
  }
}
