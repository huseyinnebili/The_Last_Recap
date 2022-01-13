package Java_Certificate_Questions;

public class Question_22 {

	

	public static void main(String[] args) {

		int ans;
		
		try {

			int num = 10;
			int div = 0;
			ans = num / div;

		} catch (ArithmeticException ae) {

			ans=0;

		} catch (NullPointerException e) {

			System.out.println("Invalid calculation.");
		}

		System.out.println("Answer = " + ans);

		
	}

}
