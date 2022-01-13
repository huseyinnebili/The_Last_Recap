package Java_Certificate_Questions;

public class Demo_Question_18 {

	public static void main(String[] args) {

		Car c = new Car();

		Car c1 = new Car("Auto");

		Car c2 = new Car("4W", 150, "Manual");

		System.out.println(c.type + " " + c.maxSpeed + " " + c.trans);

		System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);

		System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);

	}

}
