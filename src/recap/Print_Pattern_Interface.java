package recap;

public interface Print_Pattern_Interface {

	public void display();

	public void print_diamond_pattern();

	public void print_dimanond_pattern_down();

}

class Print_Pattern_2 implements Print_Pattern_Interface {

	int a = 6;

	@Override
	public void display() {

		System.out.println("We will print diamond patterns.");

	}

	@Override
	public void print_diamond_pattern() {

		for (int i = 0; i < a; i++) {

			for (int j = a - i; j >= 0; j--) {

				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}

	}

	@Override
	public void print_dimanond_pattern_down() {

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

}


  