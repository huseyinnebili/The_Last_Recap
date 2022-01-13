package Java_Certificate_Questions;

public class Question_18 {

	String type = "4W";
	int maxSpeed = 100;

	Question_18(String type, int maxSpeed) {

		this.type = type;
		this.maxSpeed = maxSpeed;
	}

	Question_18() {

	}

}

class Car extends Question_18 {

	String trans;

	Car() {

	}

	Car(String trans) {

		this.trans = trans;
	}

	Car(String type, int maxSpeed, String trans) {

		super(type, maxSpeed);

		this.trans = trans;
	}

}