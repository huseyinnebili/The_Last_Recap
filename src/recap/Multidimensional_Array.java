package recap;

public class Multidimensional_Array {

	public static void main(String[] args) {

		
		System.out.println("==========Multidimensional Array with int values========");

		int a = 10;

		// declare an array of int
		int[][] numbers = new int[4][5];

		System.out.println("Array elements are:");

		System.out.println("The length of the arraylist = " + numbers.length);

		for (int i = 0; i < numbers.length; i++) {

			for (int j = 0; j < numbers.length; j++) {

				numbers[i][j] = a; // assign values to each array element

				a++;

				 System.out.print(numbers[i][j] + " "); // print each element
			}

			System.out.println();
		}

		System.out.println("==========Multidimensional Array with String objects========");

		String[][] arr = new String[4][5];
		
		System.out.println("The length of the arraylist = " + arr.length);

		int b = 100;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				arr[i][j] = " " + b;

				b++;

			}

		}
		for (String[] c : arr) {

			for (String d : c) {

				System.out.print(d + " ");
			}

			System.out.println();
		}
	}

}
