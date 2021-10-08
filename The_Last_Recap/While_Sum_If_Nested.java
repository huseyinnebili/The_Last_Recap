package The_Last_Recap;

import java.util.Scanner;

public class While_Sum_If_Nested {

	
		static Scanner scan;
		static int sum;
		static int sum_2;

		public static void main(String[] args) {

			scan = new Scanner(System.in);

			System.out.println("How much is the soda?");
			double price = scan.nextDouble();

			System.out.println("Please pay $" + price);

			while (true) {
				double pay = scan.nextDouble();
				
				if (pay < price) {

					System.out.println("Please pay more $ " + (price = price - pay));

				} else if (pay == price) {

					System.out.println("Enjoy your soda.");
					break;

				} else if (pay > price) {

					System.out.println("You will get $ " + (pay = pay - price) + " exhance");
					break;
				}
			}
	}
}
