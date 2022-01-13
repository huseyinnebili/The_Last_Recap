package recap;

public class Demo_Super_Student {

	public static void main(String[] args) {

		Super_Student obj = new Super_Student(75, 80, 84, "Abuzer");

		obj.calculate_mark_average(65, 74, 73);
		obj.identfy_degree();
		obj.display();
	}

}
