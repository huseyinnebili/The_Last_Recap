package recap;

public class Upcasting_Downcasting {

	String name="Parent class String"; 

	void method() {
		System.out.println("Method from Parent");
	}
	
	void method_1() {
		System.out.println("Method from Parent not to be overridden.");
	}
}

class Child_2 extends Upcasting_Downcasting {

	int id=100;
	//String name="Child class String";


	// Overriding the parent method to print the signature of the child class

	@Override
	void method() {

		System.out.println("Method from Child");
	}
}
