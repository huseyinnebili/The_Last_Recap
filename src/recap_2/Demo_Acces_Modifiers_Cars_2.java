package recap_2;

import recap.Acces_Modifiers_Cars_2;

public class Demo_Acces_Modifiers_Cars_2 extends Acces_Modifiers_Cars_2{

	public static void main(String[] args) {

		
        //All variables and methods are protected.
		Demo_Acces_Modifiers_Cars_2 obj=new Demo_Acces_Modifiers_Cars_2();
		
		obj.make="Toyota";
		obj.model="Sienna";
		obj.year=2020;
		door_size=4;              // static variable
	    mileage=90000;           // static variable
	
	    obj.explain_car();
		
		

	}

}
