package The_Last_Recap;

import java.util.Scanner;

public class Scanner_Class {

	private static Scanner s;

	public static void main(String[] args) {

		s = new Scanner(System.in);

		System.out.println("Enter name, age and salary");

		// String input
		String name = s.nextLine();

		// Numerical input
		int age = s.nextInt();
		double salary = s.nextDouble();

		// Output input by user
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
	}

}
