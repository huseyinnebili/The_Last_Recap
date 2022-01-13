package Java_Certificate_Questions;

public class Question_33 {

	String name;
	boolean contract;
	double salary;

	Question_33() {

//		this.name = new String("Joe");
//		this.contract = new Boolean(true);
//		this.salary = new Double(100);

	}

	public String toString() {

		return name + ":" + contract + ":" + salary;
	}

	public static void main(String[] args) {

		Question_33 e = new Question_33();

		e.name = "Joe";
		e.contract = true;
		e.salary = 100;

		System.out.println(e);

	}
}
