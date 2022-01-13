package Java_Certificate_Questions;

public class Question_21 {

	Question_21() {

		System.out.println("Vehicle");
	}

	public void display() {

		System.out.println("I am a method in parent class.");
	}

}

class Bus extends Question_21 {

	Bus() {

		System.out.println("Bus");
	}

	public void display() {

		System.out.println("I am a method in child class.");
	}
}

class Transporter {

	public static void main(String[] args) {

		
		Question_21 obj = new Question_21();
		obj.display();
		
		
		Question_21 obj_1=new Bus();
		obj_1.display();
		
		
		Bus obj_2 = new Bus();
		obj_2.display();

		
		
	}

}
