package recap;

public class Demo_Dog {

	public static void main(String[] args) {

		Dog obj = new Dog();

		obj.height = 2;
		obj.name = "Alex";
		obj.weight = 34;
		Dog.breed = "Husky"; // static variable
		Dog.paws = 4; // static variable
		obj.get_dog_properties();
	}
}
