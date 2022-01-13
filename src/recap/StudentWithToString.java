package recap;

public class StudentWithToString {

	int  rollno;
	String name;
	String city;

	StudentWithToString(int rollno, String name, String city) {

		this.rollno = rollno;
		this.name = name;
		this.city = city;

	}

//	public String toString() {
//		return lecture + " " + name + " " + city;
//	}

	public static void main(String[] args) {

		StudentWithToString obj = new StudentWithToString(101, "Zlatan", "New Jersey City");

		
		
		System.out.println(obj.rollno);
		System.out.println(obj.city);
		System.out.println(obj.city);

	}

}
