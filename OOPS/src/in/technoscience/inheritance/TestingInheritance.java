package in.technoscience.inheritance;

// a class for testing the concept
public class TestingInheritance {
	public static void main(String[] args) {

		System.out.println("first case===>");
	
		// creating an object of parent class
		ParentClass pc=new ParentClass();
		
		//accessing all members from parent class only, a normal scenario
		System.out.println(pc.a); //output : 100
		System.out.println(pc.b);//output : 200
		System.out.println(pc.name); // output : parentclass
		pc.m1(); // accessing m1 method of parentclass
		pc.m2(); // accessing m2 method of parentclass.
		pc.display(); // accessing static method of parentclass
		pc.writeCount(); // a static method of parent class dealing with private field
		pc.finalMethod(); // accessing final method of parent class.

		
        System.out.println("second case===>");
        
        // an object of child class
		ChildClass cb =new ChildClass();
		
		System.out.println(cb.a);//output : 100 ==> can be accessed due to inheritance
		System.out.println(cb.b);//output : 30==> same name as parentclass but value changed==> explain hiding
		System.out.println(cb.c);//output : 40 ==> new member of subclass only
		//System.out.println(cb.noOfTimes); can not inherit private member so not accessible through subclass
		System.out.println(cb.name); // o/p: parent class , protected members can be inherited so accessible
		//System.out.println(cb.indicator); // again private member
		cb.m1(); // accessible due to inheritance.inheritingly present in subclass
		cb.m2(); // overridden method
		cb.m3(); // new method of subclss
		cb.display(); // static method, it will called as new method and it also explain hiding
		cb.writeCount();// subclass hiding the static method of superclass.
		cb.finalMethod();// final method being inherited but not overriden
	
		
		
		System.out.println("third case =====>");
        // another object of parent class
		ParentClass pc1=new ParentClass();
		
		System.out.println(pc1.a);//o/p ==> 100 accessing member of his own class(parentclass)
		System.out.println(pc1.b);//o/p ==> 200 accessing member of his own class(parentclass)
	 
		/*parent class does not have any information that who is going to extend him, so parent class does not know
	  about members of subclass.*/
		// System.out.println(pc1.c); // c is presnt in subclass not in parent class. 
		
		pc1.m1();// method present in his own class
		pc1.m2();// method present in his own class
		
		//pc1.m3(); its not present in his own class, so parent class can does not have any info about subclass member.
		
		
		
		// following code will explain static methods can not be overridden
		System.out.println("special scenario for static methods");
		ParentClass pc2= new ParentClass();
		ChildClass cc= new ChildClass(); 
		
		//runtime polymorphism
		ParentClass pc3= new ChildClass();
		
		pc2.writeCount(); //Number of times from super class: 6
		cc.writeCount();//Number of visit from subclass:0
		pc3.writeCount();//Number of times from super class: 6
		
		//if static method could have been overridden then last line and second last line both would have been giving
		//same output.its inherited but not overridden
		}

}
