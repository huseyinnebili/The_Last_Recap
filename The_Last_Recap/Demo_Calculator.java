package The_Last_Recap;

public class Demo_Calculator {

	public static void main(String[] args) {
		
		Calculator_With_Return_Type cal = new Calculator_With_Return_Type();

		System.out.println("Sum of the numbers = " + cal.sum(10, 5, 5));
		System.out.println("Minus of the numbers = " + cal.minus(10, 5, 5));
		System.out.println("Times of the numbers = " + cal.times(10, 5, 5));
		System.out.println("Divide of the numbers = " + cal.divide(10, 5, 5));

		System.out.println("Average of the numbers = " + (cal.average(10, 2, 4)));
		System.out.println("Maximum of the numbers = " + (cal.max_num(12, 16, 15)));
		System.out.println("Minumum of the numbers = " + (cal.min_num(12, 16, 15)));

		cal.prime();
		cal.find_Number(2, 0, 0);

	}

}
