package recap;

public class Demo_Parent {

	public static void main(String[] args) {

		Child_1 obj = new Child_1("brown", 12, "black");

		obj.age = 21;
		obj.eye_color = "Black";
		obj.hair_color = "Brown";
		obj.display();       // from parent class-overridden method
		obj.display();       // from child class-overridden method
		obj.show();          //from parent class
		obj.calculate(6, 7); //from child class-not overridden method

		
		
		Parent obj_2 = new Parent("blue", 40);

		obj_2.display(); // from parent class
		obj_2.show();    //from parent class
		
		
		

		Parent obj_3 = new Child_1("Brown", 35, "Black"); // Up-Casting

		obj_3.display(); // from parent class -overridden method
		obj_3.show();    //from parent class
		
		
		
		Child_1 obj_4 = (Child_1) obj_3; // Down-Casting
		
		obj_4.age = 40;
		obj_4.eye_color = "Green";
		obj_4.hair_color = "Yellow";
		obj_4.display();         // from parent class - overridden method
		obj_4.display();         // from child class
		obj_4.calculate(12, 23); //from child class
	}

}
