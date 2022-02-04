package recap_2;

import recap.Acces_Modifiers_Cars_0;

public class Demo_Acces_Modifiers_Cars_0 extends Acces_Modifiers_Cars_0 {

	public static void main(String[] args) {

		// All variables and methods are private.
		Demo_Acces_Modifiers_Cars_0 obj = new Demo_Acces_Modifiers_Cars_0();

		obj.color = "Yellow";
		obj.make = "Toyota";
		obj.model = "Camry";
		obj.year = 5;
		mileage = 123000;   // static variable
		door_size = 4;      // static variable

		obj.explain_car();

	}

}
