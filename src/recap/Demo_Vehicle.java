package recap;

public class Demo_Vehicle {

	public static void main(String[] args) {


		Vehicle obj=new Vehicle();
		
		Vehicle obj_2=new Vehicle("car","Toyota","Sienna",2020);
		obj_2.display_vehicle();
		
		
		Car obj_3=new Car();
		
		
		Car obj_4=new Car("car","Toyota","Sienna",9000,4,2020);
		obj_4.display_car();
		
	}

}
