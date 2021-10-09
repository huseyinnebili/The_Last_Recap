package recap;

public class Acces_Modifiers_Cars_1 {

	protected String make;
	protected String model;
	protected static int mileage;
	protected static int door_size;
	protected int year;

	protected  void explain_car() {

		System.out.println("My car is " + year + " model " + make + " " + model + " and it has " + mileage
				+ " mileages ,and " + door_size+" doors.");
	}

}
