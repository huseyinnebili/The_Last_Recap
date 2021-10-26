package recap;

public class Parent_Const_Static_Non_Static_Review {

    static String name;
	int age;
	String graduation;
	String vocation;
	static int parent_salary;
	static int mother_salary;

	private Parent_Const_Static_Non_Static_Review(String name, int age, String vocation) {

		this.age = age;
		this.vocation = vocation;

	}

	public Parent_Const_Static_Non_Static_Review(String name, int age, String vocation, String graduation) {

		this(name, age, vocation);
		this.graduation = graduation;

	}

	public void father_display() {

		System.out.println("My father name is " + name + ".He is " + age + " years old.His vocation is " + vocation
				+ ",and graduation is " + graduation + ".");
	}

	public void mother_display() {

		System.out.println("My mother's name is " + name + ".She is " + age + " years old.Her vocation is " + vocation
				+ ",and graduation is " + graduation + ".");
	}

	public static void father_hoby() {

		System.out.println("My father's hobies are reading,tracking,listening music,working out,and playing football.");

	}

	public void mother_hoby() {

		System.out.println("My mother's hobies are reading,listening music,painting and working out.");

	}

	public void parent_hoby() {

		father_hoby();       // static method calling from another non-static method.
		mother_hoby();       // non-static method calling from another non-static method.
						     // Also we can call by using this.mother_hoby();
	}

	public static void parent_salary_info() {
    
		
		System.out.println("My father salary is around "+parent_salary+",and mother's salary is around "+mother_salary+".");

	}

	public static void main(String[] args) {

		
		Parent_Const_Static_Non_Static_Review parent = new Parent_Const_Static_Non_Static_Review("Ahmet", 45, "teacher",
				"Master's degree");

		System.out.println("========Father's Info==========");
		
		name="Ali";                  // a static variable calling from a static method(main method).
		parent.age=44;               // a non-static variable calling from a static method(main method).
		parent.vocation="QA Tester"; // a non-static method calling from a static method(main method).
		parent.father_display();     // a non-static method calling from a static method.
		father_hoby();               // a static method calling from a static method(main method).
		
		
        
		System.out.println("========Mother's Info==========");
		
		name="Cigdem";                  // a static variable calling from a static method(main method).
		parent.age=41;                  // a non-static variable calling from a static method(main method).
		parent.vocation="accountant";   // a non-static variable calling from a static method(main method).
		parent.mother_display();        // a non-static method calling from a static method(main method).
		parent.mother_hoby();           // a non-static method calling from a static method(main method).
		
		
		
		System.out.println("========Parent's Common Info==========");
		
		parent_salary=75000;                // static variable calling from a static method(main method);
		mother_salary=72000;                // a static variable calling from a static method(main method).
		parent_salary_info();               // a static method calling from a static method(main method).
		parent.parent_hoby();               // a non-static method calling from static method(main method).
		

	}

}



class Child extends Parent_Const_Static_Non_Static_Review {

	String country;

	public Child(String name, int age, String vocation, String graduation) {

		super(name, age, vocation, graduation);

	}

	public Child(String name, int age, String vocation, String graduation, String country) {

		this(name, age, vocation, graduation);

		this.country = country;

	}

	public void child_hoby() {

		System.out.println("My hobies are reading,listening music,playing soccer and fishing.");
	}

	public static void family_common_hoby() {

		System.out.println("My family's common hobies are reading and listening music.");

	}
	public void child_display() {

		System.out.println("My name is " + name + ".I am " + age + " years old.My vocation is " + vocation
				+ ",and  graduation is " + graduation + ".I am from " + country + ".");
	}

}