package recap;

public class Demo_Shape_Interface {

	public static void main(String[] args) {

		System.out.println("====== Circle =======");

		Circle circle = new Circle();

		circle.calculate_Area(7);
		circle.calculate_Perimeter(7);

		System.out.println("====== Square =======");

		Square square = new Square();

		square.calculate_Area(6);
		square.calculate_Perimeter(6);

		System.out.println("======== UpCasting for Circle ========");

		Shape_Interface shape = new Circle();

		shape.calculate_Area(8);
		shape.calculate_Perimeter(8);

		System.out.println("======== UpCasting for Square ========");

		Shape_Interface shape_2 = new Square();

		shape_2.calculate_Area(9);
		shape_2.calculate_Perimeter(9);
	}
}
