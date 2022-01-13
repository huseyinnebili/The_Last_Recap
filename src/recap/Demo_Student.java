package recap;

public class Demo_Student {

	public static void main(String[] args) {

		System.out.println("======Student_A==========");

		Student_Abstraction std=new Student_A();
		
		std.display();
		std.hiking();
		std.painting();
		std.play_basketball();
		std.play_socer();
		
		
		System.out.println("========Student_B==========");
		
		
		Student_Abstraction std_2=new Student_B();
		
		std_2.display();
		std_2.hiking();
		std_2.painting();
		std_2.play_basketball();
		std_2.play_socer();

	}

}
