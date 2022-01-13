package recap;

public class Parent {

	String eye_color;
	int age;

	public Parent(String eye_color, int age) {

		this.eye_color = eye_color;
		this.age = age;

	}

	public void show() {

		System.out.println("I am an only parent class method.");
	}

	protected void display() {

		System.out.println("I am a parent,and " + age + " years old and my eye color is " + eye_color + ".");

	}
}

class Child_1 extends Parent {

	String hair_color;

	public Child_1(String eye_color, int age, String hair_color) {

		super(eye_color, age);
		this.hair_color = hair_color;

	}

	protected void display() {

		System.out.println("I am a child,and " + age + " years old and my eye color is " + eye_color
				+ " ,and hair color is " + hair_color + ".");

	}

	public void calculate(int a, int b) {

		System.out.println(a + b);
	}

}
