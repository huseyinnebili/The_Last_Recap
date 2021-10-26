package recap;

public class Animal {

	String species;
	int foot_num;
	String sound;

	protected Animal() {

		System.out.println("We will describe some animals.");
	}

	public  Animal(String species, int foot_num, String sound) {

		this.species = species;
		this.foot_num = foot_num;
		this.sound = sound;

	}

	public void display_animal() {

		System.out.println(species + " is an animal and it has " + foot_num + " foots,and it can " + sound + ".");
	}
}

class Cat extends Animal {

	String food;
	boolean breed;

	public Cat() {

		System.out.println("Cat is an animal.");
	}


	protected Cat(String species, int foot_num, String sound) {

		super(species, foot_num, sound);

	}

	 protected Cat(String species,int foot_num,String sound,boolean breed) {
		
		this(species,foot_num,sound);
		this.breed=breed;
		
	}
	
	
	protected void display_cat() {

		System.out.println(
				species + " is a animal,and it has " + foot_num + " ,and can " + sound + ", and eats " + food + ".");
		System.out.println("Can a cat breed?True/False");
		System.out.println(breed)
	}

}
