package recap;

public class Demo_Example {

	public static void main(String[] args) {

		Example obj_2 = new Example(10, 20, "Welcome");

	//	 obj_2.display();  We can not access from another class as it is a private method.
		
		obj_2.display(14, 25, "Hello");

		

		System.out.println("=======Child Class Constructors=====");
		
		Child_Example obj_3 = new Child_Example(5, 8, "Hello");
		Child_Example obj_4 = new Child_Example(10,3,"Welcome",4);

		System.out.println("=====Child Class Regular Methods=======");
		
		obj_3.display(14, 25, "Hello");
	}

}
