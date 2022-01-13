package recap;

public class Calculate_Shape_Area_Perimeder {

	protected double area;
	public double width;
	double height;
	protected int side_a;
	public int side_b;
	public int perimeder;

	public Calculate_Shape_Area_Perimeder() {

		System.out.println("We will calculate area and perimeder of some geometric shapes.");
	}

	protected Calculate_Shape_Area_Perimeder(double area, double width, double height) {

		this.area = area;
		this.width = width;
		this.height = height;

	}

	protected double getArea() {

		area = width * height;

		return 0;
	}

	public Calculate_Shape_Area_Perimeder(int perimeder, int side_a, int side_b) {

		this.perimeder = perimeder;
		this.side_a = side_a;
		this.side_a = side_a;

	}

	public double getPerimeter() {

		perimeder = side_a + side_b;

		return 0;
	}

	public void display_shape() {

		System.out.println("The calculation area  and perimeter of any shape changes dependent on it's specification.");
	}

}

class Rectangle extends Calculate_Shape_Area_Perimeder {

	double lenght;

	Rectangle() {

		super();
	}

	Rectangle(double area, double width, double height, double lenght) {

		super(area, width, height);

		this.lenght = lenght;

	}

	public double getArea() {

		area = width * lenght;

		return 0;
	}

	@Override

	public void display_shape() {

		this.getArea();
		
		System.out.println("The area of a rectangle having a width " + width + " mm and a lenght " + lenght + " is "
				+ area + " sq.mm.");
	}

	// Overload method

	public void display_shape(String shape_name) {

		System.out.println("We can calculate the area of a rectangle by multiplying the width by the length.");
	}

	
	public int getPerimeter(int a,int b,int c,int d) {
		
		perimeder=(a+b+c+d);
		
		return 0;
	}
	
	public void display_shape(int edge_num) {
		
		this.getPerimeter(12, 8, 12, 8);
		
		System.out.println("The perimeder of a rectangle having four edges is " + perimeder+" mm.");
	}
}
