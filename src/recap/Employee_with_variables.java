package recap;

public class Employee_with_variables {

	public static String name;
	protected int age;
	int number_of_kids;
	int years_of_employee;
	int salary;
	public static int bonus;

	protected void calculator_bonus() {

		if (age < 18) {

			System.out.println("I can not be hired since I am younger than 18.");
			
		

		}

		if (age >= 18) {

			if (years_of_employee < 10) {

				System.out.println("You can not receive bonus.");

			}

			if (years_of_employee >= 10) {

				if (number_of_kids == 0) {

					bonus = 250;

					salary = salary + bonus;

				}

				if (number_of_kids >= 1) {

					bonus = number_of_kids * 250;

					salary = salary + bonus;

				}

			}
		}

	}

	void display() {

		System.out.println("My name is " + name + " ,and my total salary is $" + salary + ".");
	}

}
