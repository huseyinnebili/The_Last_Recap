package recap;

public class School {

	protected String name;
	 String zip_code;

	public School(String name,String zip_code) {
		this.name = name;
		this.zip_code = zip_code;
	}

	public void display_Person() {

		System.out.println("The school's name is " + name + " ,and its zip code is " + zip_code+".");
	}
}
	 class Student extends School {

		public char branch;
		public int student_id;

		public Student(String name, String zip_code, char branch, int student_id) {

			super(name, zip_code);

			this.branch = branch;
			this.student_id = student_id;

		}

		public void display_student() {
			
			
			System.out.println("I am a student at "+name+" , and its zip code is "+zip_code+".");
			System.out.println("My branch is "+branch+" ,and student id is "+student_id+".");

		}
	}


