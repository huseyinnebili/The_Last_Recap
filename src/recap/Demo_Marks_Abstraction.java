package recap;

public class Demo_Marks_Abstraction {

	public static void main(String[] args) {

		Marks_Abstraction std_1 = new Student_X(87, 73, 92);

		System.out.println(std_1.getAverage());
		
		
		

		Marks_Abstraction std_2 = new Student_Y(87, 73, 92, 99);

		System.out.println(std_2.getAverage());

	}

}
