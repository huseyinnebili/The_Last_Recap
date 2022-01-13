package recap;

public class Manipulation_String {

	String str;
	int a, b, c, d;
	String str_2;

	Manipulation_String() {

		System.out.println("We will give examples about manipulation of String.");
	}

	Manipulation_String(String str) {

		this();

		this.str = str;

		System.out.println("The index of 'o' character of String = " + str.indexOf('o'));

		System.out
				.println("The index of the second 'o' character of String = " + str.indexOf('o', str.indexOf('o') + 1));

		System.out.println("The characters of between 3 and 9 index = " + str.substring(3, 9));
	}

	Manipulation_String(String str, String str_2) {

		this("Today is CoDing day");

		this.str = str;
		this.str_2 = str_2;

		System.out.println("Is the first String equal to the second String?" + str.equals(str_2));

		System.out.println("Is the first String equal to the second String after lower casing?"
				+ str.toLowerCase().equals(str_2.toLowerCase()));
	}

	Manipulation_String(String str, int a) {

		this("Today is CodinG day", "Today is coding day");

		this.str = str;
		this.a = a;

		String reverse = " ";

		String[] arr = str.split("");

		for (int i = arr.length - 1; i >= 0; i--) {

			reverse = reverse + arr[i];
		}

		System.out.println("The reverse of the String through split() = " + reverse);
	}

	Manipulation_String(String str, int a, int b) {

		this("Today is coding day", 1);

		this.b = b;

		String reverse_2 = " ";

		char[] ch = str.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {

			reverse_2 = reverse_2 + ch[i];
		}

		System.out.println("The reverse of the String through charArray() = " + reverse_2);
	}

	Manipulation_String(String str, int a, int b, int c) {

		this("Today is off day", 1, 2);

		this.c = c;

		String reverse_3 = " ";

		for (int i = str.length() - 1; i >= 0; i--) {

			char chr = str.charAt(i);

			reverse_3 = reverse_3 + chr;
		}

		System.out.println("The reverse of the String through charIndex() = " + reverse_3);
	}

	Manipulation_String(String str, int a, int b, int c, int d) {

		this("Today is Java coding day", 1, 2, 3);

		this.d = d;

		String reverse_4 = " ";

		for (int i = str.length(); i > 0; i--) {

			reverse_4 = reverse_4 + str.substring(i - 1, i);
		}

		System.out.println("The reverse of the String through substring = " + reverse_4);

	}

}

class Child_Manipulation_String extends Manipulation_String {

	String strng;

	Child_Manipulation_String() {

		System.out.println("We will show how to convert a char to String.");
	}

	Child_Manipulation_String(String str, int a, int b, int c, int d, String strng) {

		super("Today is Postman coding day", 0, 1, 2, 3);

		this.strng = strng;

		char[] ch = { 'W', 'e', 'l', 'c', 'o', 'm', 'e' };

		for (int i = 0; i < ch.length; i++) {

			System.out.print(ch[i] + ",");

			strng = String.valueOf(ch);

		}

		System.out.println();
		System.out.println(strng);
	}

}