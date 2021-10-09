package recap;

public class Dog {

	static String breed = "";
	static int paws;
	String name;
	int weight;
	int height;

	protected void get_dog_properties() {

		System.out.println(name + " is a breed of " + breed + " and weight is " + weight + " and height is " + height
				+ ", and it has " + paws + " paws.");

	}

}
