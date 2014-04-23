package in.technoscience;

public class Testing {
public static void main(String[] args) {
	ProperEncapsulation pe= new ProperEncapsulation();
	//pe.age=-6; // compiler will complain 
    int age= pe.getAge();
    System.out.println(age);
   
 
}
}
