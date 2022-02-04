package Java_Certificate_Questions;

public class Qustion_17 {

	int x, y;

	Qustion_17(int x, int y) {

		initialize(x, y);

		// System.out.println(this.x + " : " + this.y);

	}

	public void initialize(int x, int y) {

		this.x = x * x;
		this.y = y * y;

	}

	public String toString() {

		return this.x + " " + this.y;
	}

	public static void main(String[] args) {

		int x = 3, y = 5;

		Qustion_17 obj = new Qustion_17(x, y);

		System.out.println(obj);

		System.out.println(x + " : " + y);

	}

}
