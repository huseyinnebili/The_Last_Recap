package Java_Certificate_Questions;

public class Method_toString {

	String name;
	int age;
	String college;
	String course;
	String address;

	Method_toString(String name, int age, String college, String course, String address) {
		
		// This variable refers to current instance itself
		this.name = name;
		this.age = age;
		this.college = college;
		this.course = course;
		this.address = address;
	}

	public String toString() {

		return name + " " + age + " " + college + " " + course + " " + address;
	}

	public static void main(String[] args) {

		// Creating an object of this class
		// Custom attributes been passed as in arguments

		Method_toString b = new Method_toString("John", 21, "Bergen Community", "M.TECH", "NJ");

		// Print and display commands to illustrate toString() method as both will print
		// the same Print the object

		System.out.println(b);

		// Print the object but implicitly using toString() method

		  System.out.println(b.toString());
	}
}
