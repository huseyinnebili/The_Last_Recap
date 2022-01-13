package Java_Certificate_Questions;

public class Question_13 {

	int x;

	Question_13() {

		this(10);
	}

	Question_13(int x) {

		this.x = x;
	}
}

class Question_13_1 extends Question_13 {

	int y;
	

	Question_13_1() {

		super(10);

	}

	Question_13_1(int y) {

		super(y);

		this.y = y;

	}

	Question_13_1(int x, int y) {

		super(x);

		this.y = y;

	}

	public String toString() {

		return this.x + ":" + this.y ;
	}
}
	

class Demo_Question_13{
	
	public static void main(String[] args) {

		Question_13 obj = new Question_13_1(20,10);

		System.out.println(obj);

		Question_13 obj_2 = new Question_13_1(20);
		
		System.out.println(obj_2);

}}
