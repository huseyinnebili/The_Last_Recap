package recap;

public class Car_Overload_Override {
	
	public void display () {
		
		System.out.println("I am a method in parent class.");
	}
	
	static void display_2() {
		
		System.out.println("I am a static method in parent class.");
		
	}

}

class Acura extends Car_Overload_Override{
	
	public void display() {
		
		System.out.println("I am a overridden method in child class.");
	}
	
	public static void display_2() {
		
		System.out.println("I am a static method in child class.");
	}
}

