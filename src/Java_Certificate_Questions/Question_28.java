package Java_Certificate_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question_28 {

	public static void main(String[] args) {

		String[] arr = { "Hi", "How", "Are", "You" };

		List<String> arrList = new ArrayList<>(Arrays.asList(arr));

		if (arrList.removeIf(s -> {
			System.out.print(s);
			return s.length() <= 2;
		})) {

			System.out.println(" removed");

		}

		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		numbers.removeIf(number -> number % 2 != 0);

		System.out.println("Numbers after removed =  " + numbers);

		
		
		
		System.out.print("Displaying of dublicate numbers of the list = ");
		
		int[] dublicate_numbers = { 1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 7, 8, 8, 9,1 };

		for (int i = 0; i < dublicate_numbers.length; i++) {

			for (int j = i + 1; j < dublicate_numbers.length; j++) {

				if (dublicate_numbers[i] == dublicate_numbers[j]) {

					System.out.print(dublicate_numbers[j]+",");
				}
			}
		}

	}
}
