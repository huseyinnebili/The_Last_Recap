package recap;

public class FinalMethodCalling {

	final String name = "Zlatan";
	final int age = 40;

	final public static void display() {

		System.out.println("I am a final static overloading method in parent class.");
	}

	final public void display(String name) {

		System.out.println("My name is " + this.name + ".");

		System.out.println("I am a final non-static overloaded method in parent class.");
	}

	final public void display(int age) {

		System.out.println("I am " + this.age + " years old.");

		System.out.println("I am a final non-static overloaded method in parent class.");
	}

}

final class Final_Child_Class extends FinalMethodCalling {

	final  int age = 48;
	final String name = "Carlos";
	static double rate=0.15;

	// final method can be overloaded however can not be overridden.

//	final public void display() {
//
//		System.out.println("I am a final non-static overloading method.");
//	}

	final protected void display_child() {

		System.out.println("I am a final protected method overloaded in a final child class.");

	}

	final static void display_child(String name) {

		System.out.println("I am a final default method overloading in a final child class.");

		System.out.println("My name is " + name + ".");

	}

	final private void display_child(int age) {

		System.out.println(
				"I am a final private method which can be accessed within the same class overloading in a final child class .");

		System.out.println("I am " + this.age + " years old.");
	}

	final public void display_child(int age, String name) {

		this.display_child(12); // Final non-static private method overloading in child class which can accessed
								// within same class.

		System.out.println("I am a final public static method overloading in a final child class.");

		System.out.println("My name is " + this.name + " and I am " + this.age + " years old.");
		
		System.out.println("This is a static variable and its value can be changed = "+rate+".");

	}
}
