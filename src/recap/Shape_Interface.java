package recap;

public interface Shape_Interface {

	void calculate_Area(double area);

	void calculate_Perimeter(double perimeter);

}

class Circle implements Shape_Interface {

	@Override
	public void calculate_Area(double radius) {

		double circle_area = 3.14 * radius * radius;

		System.out.println("The area of the circle is " + circle_area);

	}

	@Override
	public void calculate_Perimeter(double radius) {

		double circle_perimeter = 2 * 3.14 * radius;
		System.out.println("The perimeter of the circle is " + circle_perimeter);
	}

}

class Square implements Shape_Interface {

	@Override
	public void calculate_Area(double side) {

		double square_area = side * side;

		System.out.println("The area of the square is " + square_area);

	}

	@Override
	public void calculate_Perimeter(double side) {

		double square_perimeter = 4 * side;

		System.out.println("The perimeter of the square is " + square_perimeter);
	}

}