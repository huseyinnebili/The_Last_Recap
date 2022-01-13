package recap;

public abstract class Print_Star_Abstraction {

	public void display() {

		System.out.println("We will print several types of star pattern. ");
	}

	public abstract void print_right_pattern();

	public abstract void print_right_pattern_down();

	public abstract void print_left_pattern();

	public abstract void print_left_pattern_down();

}

class Print_Star extends Print_Star_Abstraction {

	int a = 6;

	@Override
	public void print_right_pattern() {

		for (int i = 0; i < a; i++) {

			for (int j = 0; j < i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}

	}

	@Override
	public void print_right_pattern_down() {

		for (int i = a; i >= 0; i--) {

			for (int j = 0; j < i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}

	}

	@Override
	public void print_left_pattern() {

		System.out.println();

		for (int i = 0; i < a; i++) {

			for (int j = 2 * (a - i); j >= 0; j--) {

				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {

				System.out.print("* ");
			}
			System.out.println();
		}

	}

	@Override
	public void print_left_pattern_down() {

		for (int i = a; i >= 0; i--) {

			for (int j = 2 * (a - i); j >= 0; j--) {

				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}

	}

	public void display() {
		
		System.out.println("We printed right and left print patterns.");
	}
}
