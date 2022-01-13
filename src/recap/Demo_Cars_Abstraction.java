package recap;

public class Demo_Cars_Abstraction {

	public static void main(String[] args) {

		Cars_Abstraction obj = new Toyota();

		obj.speed();
		obj.consumption();
		obj.getColor();
		obj.getPrice();

		System.out.println("===============");
		
		Cars_Abstraction obj_2 = new Honda();

		obj_2.consumption();
		obj_2.getColor();
		obj_2.getPrice();
		obj_2.speed();
	}

}
