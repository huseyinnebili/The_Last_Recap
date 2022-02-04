package recap;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo_Car_2 {

	public static void main(String[] args) {

		// We want to create an ArrayList with car objects.

		ArrayList<Car_2> cars = new ArrayList<>();

		// short way to add an objects into ArrayList
		cars.add(new Car_2("Toyota", "Sienna", 2019));
		cars.add(new Car_2("Honda", "Civic", 2003));
		cars.add(new Car_2("Mercedes", "CLK", 2020));
		cars.add(new Car_2("Nissan", "Almera", 2016));

		// Long way to add an object into ArrayList
		Car_2 c = new Car_2("VW", "Tiguan", 2019);

		cars.add(c);

		System.out.println("======= To get values trough for loop =======");

		for (int i = 0; i < cars.size(); i++) {

			// Short way to get values trough for loop
			cars.get(i).printInfo();

			// Long way to get values trough for loop
			System.out.println("This car is a " + cars.get(i).make + " " + cars.get(i).model + " of year "
					+ cars.get(i).year + " !!");
		}

		System.out.println("======= To get values trough for enhanced loop =======");

		for (Car_2 car : cars) {

			// Short way to get values trough for enhanced loop.
			car.printInfo();

			// Long way to get values trough for enhanced loop.
			System.out.println("This car is a " + car.make + " " + car.model + " of year " + car.year + " !!");
		}

		System.out.println("======= To get values trough iterator =======");

		Iterator<Car_2> it = cars.iterator();

		while (it.hasNext()) {

			Car_2 car = it.next();

			car.printInfo();
		}
	}

}
