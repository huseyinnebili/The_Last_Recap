package recap;

public class Parent {

	String eye_color;
	int age;

	protected Parent(String eye_color, int age) {

		this.eye_color = eye_color;
		this.age = age;

	}

	public void display_parent() {

		System.out.println("I am a parent.I am " + age + " years old and my eye color is " + eye_color + ".");
	}
}

class Child_1 extends Parent {

	String hair_color;

	protected Child_1(String eye_color, int age, String hair_color) {

		super(eye_color, age);
		this.hair_color = hair_color;

	}

	 void display_child_1() {

		System.out.println("I am a child.I am " + age + " years old and my eye color is " + eye_color
				+ " ,and hair color is " + hair_color + ".");
	}
}
