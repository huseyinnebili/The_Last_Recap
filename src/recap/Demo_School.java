package recap;

public class Demo_School {

	public static void main(String[] args) {


		School obj=new School("Ryrson Elementary School","07470");
		obj.display_Person();
		
		
		Student obj_2=new Student("Ryrson","07470",'A',101);
		obj_2.display_student();

		
		Student obj_3=new Student("Lincoln Elementary School","07350",'C',35);
		obj_3.display_student();
	}

}
