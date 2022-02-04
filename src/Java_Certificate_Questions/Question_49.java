package Java_Certificate_Questions;

public class Question_49 {

	public static void main(String[] args) {

		int n[][] = { { 1, 3 }, { 2, 4 } };

		for (int i = n.length - 1; i >= 0; i--) {

			for (int y : n[i]) {

				System.out.print(y);
			}
		}
		
		System.out.println();
		
		for(int i=0;i<n.length;i++) {
			
			for(int z:n[i]) {
				
				System.out.print(z);
			}
		}

	}

}
