package recap;

public class Print_Pattern_Constructor {

	int a, b, c;

	Print_Pattern_Constructor() {

		System.out.println("We will print some type of pattern.");
	}

	Print_Pattern_Constructor(int a) {

		this.a = a;

		for (int i = 0; i < a; i++) {

			for (int j = 0; j <=i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}

	}

	Print_Pattern_Constructor(int a, int b) {

		this.a = a;
		this.b = b;

		
		for (int i = 0; i < a; i++) {

			for (int j =2*(a - i); j > 0; j--) {

				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}

	}

	Print_Pattern_Constructor(int a, int b, int c) {

		this.a = a;
		this.b = b;
		this.c = c;

		for (int i = 0; i < a; i++) {

			for (int j = (a - i); j > 0; j--) {

				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}
	}

}

class Print_Pattern_Child_Class extends Print_Pattern_Constructor {

	String name;

	Print_Pattern_Child_Class() {

		super();

		System.out.println("=================");
	}

	Print_Pattern_Child_Class(int a, String name) {

		super(a);

		this.name = name;

		
		for (int i = a; i > 0; i--) {

			for (int j = 0; j < i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}
		System.out.println("We created a pattern called " + name + ".");

		System.out.println();
	}

	Print_Pattern_Child_Class(int a, int b, String name) {

		super(a, b);
		this.name = name;

		for (int i = a; i > 0; i--) {

			for (int j = 2*(a - i); j > 0; j--) {

				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}

		System.out.println("We created a pattern called " + name + ".");
	}
	
	
	Print_Pattern_Child_Class(int a, int b,int c, String name) {
		
		super(a,b,c);
		
		this.name=name;
		
		for(int i=a;i>0;i--) {
			
			for(int j=(a-i);j>0;j--) {
				
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++) {
				
				System.out.print("* ");
			}
			
			System.out.println();
		}

		System.out.println("We created a pattern called " + name + ".");
}

	
}