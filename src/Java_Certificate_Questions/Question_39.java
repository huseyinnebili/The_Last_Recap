package Java_Certificate_Questions;

public class Question_39 {

	String type = "Canine";
	int maxSpeed = 60;

	Question_39() {

	}

	Question_39(String type, int maxSpeed) {

		this.type = type;
		this.maxSpeed = maxSpeed;
	}
}

class WildAnimal extends Question_39 {

	String bounds;

	WildAnimal(String bounds) { // line n1

	super();
		
    this.bounds = bounds;

	}

	WildAnimal(String type, int maxSpeed, String bounds) { // line n2

		super(type, maxSpeed);
		this.bounds = bounds;

	}
}
