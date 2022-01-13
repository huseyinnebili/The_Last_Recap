package recap;

public class Example {

	int a;
	String name;

	private Example() {

		System.out.println("This is a private constructor with non parameter.");
	}

	Example(int a) {

		this();

		this.a = a;

		System.out.println("This is default constructor with a parameter constructor.");
	}

	protected Example(int a, String name) {

		this(a);

		System.out.println("This a protected constructor with two parameters.");

	}

	public Example(int a, int b, String name) {

		this(a, name);

		System.out.println("This is a public constructor with three parameters.");
	}

	private void display() {

		System.out.println("This is a private method.");
	}

	void display(int a) {

		display(); // We can call private method within same class.

		System.out.println("This is an overloaded default method.");
	}

	protected void display(int a, String name) {
        
		display(a);
		
		System.out.println("This is an overloaded protected method.");
	}

	public void display(int a, int b, String name) {
		
		display(a,name);

		System.out.println("This is an overloaded public method.");
	}
}

class Child_Example extends Example {

	// private Child_Example() {

	// super(); We can not call it from another class as it is a private
	// constructor.
	// }

	Child_Example(int a) {

		super(a);

		System.out.println("This is a default child class constructor with one parameter.");

	}

	protected Child_Example(int a, String name) {

		this(a);

		System.out.println("This is a protected child class constructor with two parameters.");
	}

	public Child_Example(int a, int b, String name) {

		this(a,name);

		System.out.println("This is a public child class constructor with three parameters.");
	}

	public Child_Example(int a,int b,String name,int c) {
		
		super(a,b,name);
		
		System.out.println("This is a public child class constructor with four parameters.");
		
	}
	
	private void display() {

//		display();  We can not access from another class as it is a private method.

		System.out.println("This is an overriden private child class method.");
	}

	void display(int a) {

		display();//We can access a private method within the same class.
		
		System.out.println("This is an overriden default child class method.");
	}

	protected void display(int a, String name) {
		
		display(a);
		
		System.out.println("This is an overriden protected child class method.");

	}

	public void display(int a, int b,  String name) {
		
		display(a,name);
		
		System.out.println("This is an overriden public child class method.");

	}
	
	
	

}
