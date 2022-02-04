package recap;

public class Acces_Modifiers_Cars_0 {

	
	//All variables and methods are private.
	private String make;
	private String model;
	private static int mileage;
	private static int door_size;
	private int year;
	private String color;

	private void explain_car() {

		System.out.println("My car is " + year + " model " + make + " " + model + " and it has " + mileage
				+ " mileages ,and " + door_size + " doors ,and its color is " + color + ".");

	}
	
	public static void main(String[] args) {
		
		Acces_Modifiers_Cars_0 obj=new Acces_Modifiers_Cars_0();
		
		obj.color="Yellow";
		obj.make="Toyota";
		obj.model="Camry";
		obj.year=5;
		mileage=123000;   // static variable
		door_size=4;      // static variable
		
		obj.explain_car();
		
	}
}