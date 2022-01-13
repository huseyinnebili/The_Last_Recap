package recap;

public class Demo_FinalMethodCalling {

	public static void main(String[] args) {
		
		
		FinalMethodCalling.display(); // final static method no overridden in parent class.
		
		
		FinalMethodCalling obj_2=new FinalMethodCalling();
		
		obj_2.display(35); // final non-static method default method overloaded in parent class.
		

		Final_Child_Class obj = new Final_Child_Class();

		obj.display("Ibrahimovich"); // final non-static method no overridden in parent class.
		obj.display_child(); // final non-static protected method overloaded in child class.
		obj.display_child(12, "Coding"); // final non-static public overloading method in child class.
		
		Final_Child_Class.rate=1.535; //static variable an can be accessed trough its class name.
		
		obj.display_child(12, "Coding"); // final non-static public overloading method in child class.

		Final_Child_Class.display_child("World"); // final static default method overloading in child class.


	}

}
