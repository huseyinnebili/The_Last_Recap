package Java_Certificate_Questions;

public class Question_24 {

	public Question_24() {

		System.out.println("A ");
	}

}

class B extends Question_24 {

	public B() {

		System.out.println("B ");
	}

}

class C extends B {

	public C() {

		System.out.println("C ");
	}

	public static void main(String[] args) {

		System.out.println("======= Class C =======");
		C c = new C();

		System.out.println("======= Class B ==========");
		B b = new B();

		System.out.println("======= Class A ==========");
		Question_24 a = new Question_24();
	}
}