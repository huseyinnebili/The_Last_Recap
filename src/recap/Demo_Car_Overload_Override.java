package recap;

public class Demo_Car_Overload_Override {

	public static void main(String[] args) {

		Car_Overload_Override obj = new Acura();//Polymorphism
		obj.display();//overridden method

		Acura.display_2();                 //static method - cannot be overridden
		Car_Overload_Override.display_2(); //static method - cannot be overridden

		
		
		
		Car_Overload_Override obj_2=new Car_Overload_Override();
		obj_2.display();//parent class method
		
	}

}
