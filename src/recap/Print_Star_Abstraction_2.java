package recap;

public abstract class Print_Star_Abstraction_2 {

	public void display() {

		System.out.println("We will print stars.");
	}

	public abstract void print_right_star();

	public abstract void print_left_star();

	public abstract void print_diamond_star();

}

class Print extends Print_Star_Abstraction_2 {

	@Override
	public void print_right_star() {

		int a = 6;

		for (int i = 0; i < a; i++) {

			for (int j = 0; j < i; j++) {

				System.out.print(" * ");
			}

			System.out.println();
		}

		for (int k = a; k >= 0; k--) {

			for (int l = 0; l < k; l++) {

				System.out.print(" * ");
			}

			System.out.println();
		}
	}

	@Override
	public void print_left_star() {

		int a = 6;

		for (int i = 0; i < a; i++) {

			for (int j = 2 * (a - i); j >= 0; j--) {

				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}

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

	@Override
	public void print_diamond_star() {

		int a = 6;

		for (int i = 0; i < a; i++) {

			for (int j = a - i; j >= 0; j--) {

				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}

		for (int i = a; i >= 0; i--) {

			for (int j = a - i; j >= 0; j--) {

				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}

	}

	public void display() {

		System.out.println("We will print stars in child class.");
	}

}