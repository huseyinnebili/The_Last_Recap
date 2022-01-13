package Java_Certificate_Questions;

public class Question_10 {



	static int doCalculate(int var1) {

		var1 = var1 * 2;

		return var1;
	}

	static int doCalcul(int var2) {

		var2 = var2 / 5;

		return var2;
	}

	public static void main(String[] args) {

		 int var1 = 200;

		System.out.print(doCalculate( var1));
		System.out.print(" " + var1);

		System.out.println();

		int var2 = 400;

		System.out.print(doCalcul(var2) + " ");
		System.out.print(var2);

	}

}
