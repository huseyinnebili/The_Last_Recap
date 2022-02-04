package recap;

public class Demo_Acces_Modifiers_Cars_2 {

	public static void main(String[] args) {

		// All variables and method are protected.
		Acces_Modifiers_Cars_2 obj = new Acces_Modifiers_Cars_2();

		obj.color = "Purple";
		obj.make = "Toyota";
		obj.model = "Corolla";
		obj.year = 2018;
		Acces_Modifiers_Cars_3.door_size = 4; // static variable
		Acces_Modifiers_Cars_3.mileage = 124000; // static variable
		
		obj.explain_car();

	}

}
