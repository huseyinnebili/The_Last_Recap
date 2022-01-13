package recap;

public interface Review_Manipulation_Interface {

	public void doLowerAndUpperCast(String str1, String str2);

	public void findIndex(String str);

	public void convertString();

	public void convertChar();

	public void doReverse();

}

class WorkPage implements Review_Manipulation_Interface {

	@Override
	public void doLowerAndUpperCast(String str1, String str2) {

		System.out
				.println("To compare whether two Strings are equal or not BEFORE manipulation = " + str1.equals(str2));

		System.out.println("To compare whether two Strings are equal or not AFTER manipulation = "
				+ str1.toUpperCase().equals(str2.toUpperCase()));

		System.out.println("To compare whether two Strings are equal or not AFTER manipulation = "
				+ str1.toLowerCase().equals(str2.toLowerCase()));

		System.out.println(str1.toUpperCase());

		System.out.println(str2.toLowerCase());
	}

	@Override
	public void findIndex(String str) {

		System.out.println("The LENGTH of the String = " + str.length());

		System.out.println("The index of 'o' character = " + str.indexOf('o'));

		System.out
				.println("The index of second occurence of 'o' character = " + str.indexOf('o', str.indexOf('o') + 1));

		System.out.println("The index of second 'a' charecter after  5 characters = " + str.indexOf('a', 5));

		System.out.println("The index of 'T' character = " + str.indexOf('T'));
	}

	@Override
	public void convertString() {

		char[] ch = { 'W', 'e', 'l', 'c', 'o', 'm', 'e' };

		for (int i = 0; i < ch.length; i++) {

			System.out.print(ch[i] + ",");
		}

		String str = String.valueOf(ch);

		System.out.println();

		System.out.println(str);

		char[] ch_2 = { 'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!' };

		String str_2 = new String(ch_2);

		System.out.println(str_2);

	}

	@Override
	public void convertChar() {

		String str = "Today is coding day!";

		System.out.println(str);

		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			System.out.print(ch[i] + "  ");
		}

		System.out.println();

		String str_2 = "Hello World!";

		for (int i = 0; i < str_2.length(); i++) {

			char ch_2 = str_2.charAt(i);

			System.out.print(ch_2 + "  ");
		}
	}

	@Override
	public void doReverse() {

		String str = "Today is off day!";

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			char ch = str.charAt(i);

			reverse = reverse + ch;

		}

		System.out.println();

		System.out.print(reverse);

		String str_2 = "Hello World!";

		String reverse_2 = "";

		char[] ch_2 = str_2.toCharArray();

		for (int i = ch_2.length - 1; i >= 0; i--) {

			reverse_2 = reverse_2 + ch_2[i];
		}

		System.out.println();

		System.out.print(reverse_2);

	}

}
