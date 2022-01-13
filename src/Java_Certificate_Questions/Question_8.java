package Java_Certificate_Questions;

public class Question_8 {

	static int i;
	static int j;

	public static void main(String[] args) {

		String[][] arr = { { "A", "B", "C" }, { "D", "E" } };

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j].equals("B") || arr[i][j].equals("C")) {

					continue;
				}

				System.out.print(arr[i][j] + " ");

			}
			continue;
		}

		String[][] arr_1 = { { "A", "B", "C" }, { "D", "E", "F" }, { "G", "H" } };

		for (int i = 0; i < arr_1.length; i++) {

			for (int j = 0; j < arr_1[i].length; j++) {

				if (arr_1[i][j].equals("B")) {

					continue;
				}

				System.out.print(arr_1[i][j] + " ");

			}

			continue;
		}
	}

}
