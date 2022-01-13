package Java_Certificate_Questions;

public class Question_2 {

	public static void main(String[] args) {

		int i = 10;

		int j = 20;

		System.out.println("j1= "+j);
		
		int k = (j += i) / 5;

		System.out.println("j2 = "+j);
		
		System.out.print(i + " " + j + " " + k);

	}

}
