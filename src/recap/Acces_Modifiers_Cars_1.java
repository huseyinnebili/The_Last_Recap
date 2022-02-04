package recap;

  public class Acces_Modifiers_Cars_1 {

	//All variables and methods are default.
	  String make;
      String model;
      static int mileage;
      static int door_size;
      int year;
      String color;

       void explain_car() {

		System.out.println("My car is " + year + " model " + make + " " + model + " and it has " + mileage
				+ " mileages ,and " + door_size + " doors ,and its color is " + color + ".");
	}

}
