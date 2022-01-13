package Java_Certificate_Questions;

public class Question_20 {

	int a1;
	int a;
	String s;

	public static void doProduct(int a) {

		a = a * a;

		//System.out.println(a);
	}

	public static void doString(String s) {

		s.concat(" " + s);

		//System.out.println(s);
	}

	public String toString() {

		return a + ":" + s;
	}

	public static void main(String[] args) {

		Question_20 item = new Question_20();

		item.a1 = 11;
		String sb = "Hello";
		Integer i = 10;
		item.a=5;
		item.s="Java";

		doProduct(i);
		doString(sb);
		doProduct(item.a1);

		//System.out.println(item);

		System.out.println(i + " " + sb + " " + item.a1);

	}

}
