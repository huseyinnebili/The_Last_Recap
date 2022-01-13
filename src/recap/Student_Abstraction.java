package recap;

public abstract class Student_Abstraction {

	public void display() {

		System.out.println("Every student should have a social activity.");
	}

	public abstract void play_socer();

	public abstract void play_basketball();

	public abstract void hiking();

	public abstract void painting();
}

class Student_A extends Student_Abstraction {

	@Override
	public void play_socer() {

		System.out.println("Student_A likes socer but he/she does not prefer playing socer.");

	}

	@Override
	public void play_basketball() {

		System.out.println("Student_A used play basketball last year.");

	}

	@Override
	public void hiking() {

		System.out.println("Hiking is the main activity of Student_A.");
	}

	@Override
	public void painting() {

		System.out.println("Student_A  never deals with painting. ");

	}

}

class Student_B extends Student_Abstraction{

	@Override
	public void play_socer() {
		
		System.out.println("Student_B plays and enjoys soccer.");

	}

	@Override
	public void play_basketball() {


		System.out.println("Student_B is a professinal college player.");
		
	}

	@Override
	public void hiking() {

System.out.println("Student_B has never attended any hiking club.");
	}

	@Override
	public void painting() {
		
		System.out.println("Student_B  deals with painting as an amateur.");
	}
	
	
}
