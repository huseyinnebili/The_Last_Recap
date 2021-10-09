package recap_2;

import recap.Acces_Modifiers_Cars_1;

public class Demo_Acces_Modifiers_Cars_1 extends Acces_Modifiers_Cars_1 {

	public static void main(String[] args) {
		
		Demo_Acces_Modifiers_Cars_1 obj=new Demo_Acces_Modifiers_Cars_1();
		
		obj.make="Honda";
		obj.model="Civic";
		obj.year=2020;
		mileage=123000;          //static variable
		door_size=4;             //static variable
		obj.explain_car();

	}

}
