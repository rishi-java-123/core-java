package in.technoscience.first;
public class MainApp {
  public static void main(String [] args) {
    CategoryA cA = new CategoryA(10000, 200);
    Employee emp = new Employee ("technoscience",cA);
    emp.display();
  }
}