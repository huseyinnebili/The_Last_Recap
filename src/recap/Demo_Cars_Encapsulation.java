package recap;

public class Demo_Cars_Encapsulation {

	public static void main(String[] args) {


		Cars_Encapsulation obj=new Cars_Encapsulation();
		
		obj.setMake("Toyota");
		obj.setModel("Sienna");
		obj.setPrice(50000);
		obj.setTopSpeed(99);
		
		
		System.out.println(obj.getMake());
		System.out.println(obj.getModel());
		System.out.println(obj.getPrice());
		System.out.println(obj.getTopSpeed());
		
	}

}
