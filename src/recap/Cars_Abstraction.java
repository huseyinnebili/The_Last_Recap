package recap;

public abstract class Cars_Abstraction {

	public void speed() {

		System.out.println("Every car has different speed.");
	}

	public void consumption() {

		System.out.println("Every car's consumption changes.");
	}

	public abstract void getColor();

	public abstract void getPrice();

}

class Toyota extends Cars_Abstraction {

	@Override

	public void getColor() {

		System.out.println("I have a Toyota Sienna which has red color.");
	}

	@Override
	public void getPrice() {

		System.out.println("I paid $32000 for Toyota Sienna.");
	}
	
	@Override
	
	public void speed() {
		
		System.out.println("Toyota Sienna can not speed in the shortest time.");
	}
}

class Honda extends Cars_Abstraction{

	@Override
	public void getColor() {
		
		System.out.println("I have a Honda Civic which has black color.");
		
	}

	@Override
	public void getPrice() {
		
		System.out.println("It might be purchased around $3000.");
	}
	
	@Override
	
	
	public void consumption() {
		
		System.out.println("Honda has very low gas consumption.");
	}
	
}
