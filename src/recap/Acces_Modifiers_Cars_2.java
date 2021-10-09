package recap;

public class Acces_Modifiers_Cars_2 {
	
	public String make;
	public String model;
	public static int mileage;
	public static int door_size;
	public int year;
	public String color;

	public void explain_car() {

		System.out.println("My car is " + year + " model " + make + " " + model + " and it has " + mileage
				+ " mileages ,and " + door_size+" doors ,and its color is "+color+".");
	}

}
