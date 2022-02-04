package recap;

public abstract class Insurance_Abstraction {

	// Create a class Insurance that will have an attribute as insuranceName
	// and unimplemented behavior as getQuote and cancelInsurance.
	// Create 3 classes Car,Pet and Health.
	// Car class has its own attribute as carModel
	// and Class Pet has petType attribute.
	// Create 3 objects of the sub classes and store them in ArrayList.
	// Using for loop/advanced for loop/iterator access all methods of the class.

	String insuranName;

	Insurance_Abstraction(String insuranName) {

		this.insuranName = insuranName;

	}

	abstract void getQuote();

	abstract void cancelInsurance();

}

class CarInsurance extends Insurance_Abstraction {

	String carModel;

	CarInsurance(String insuranName, String carModel) {

		super(insuranName);

		this.carModel = carModel;
	}

	@Override
	void getQuote() {

		System.out.println("The quote for " + carModel + " is $200");

	}

	@Override
	void cancelInsurance() {

		System.out.println("Canceling the CAR insurance.");
	}

}

class PetInsurance extends Insurance_Abstraction {

	String petType;

	PetInsurance(String insuranName, String petType) {

		super(insuranName);

		this.petType = petType;

	}

	@Override
	void getQuote() {

		System.out.println("The quote for " + petType + " is $500");

	}

	@Override
	void cancelInsurance() {

		System.out.println("Canceling the PET insurance.");

	}

}

class HealthInsurance extends Insurance_Abstraction {

	HealthInsurance(String insuranName) {

		super(insuranName);

	}

	@Override
	void getQuote() {

		System.out.println("The quote for health insurance is $1500");

	}

	@Override
	void cancelInsurance() {
		
		System.out.println("Canceling the HEALTH insurance.");

	}

}