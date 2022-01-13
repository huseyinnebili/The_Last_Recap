package recap;

public class AccessModifiers_with_Palidrome {

	boolean flag;

	public String reverseString(String str) {

		String reversed = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			char ch = str.charAt(i);

			reversed = reversed + ch;
		}

		return reversed;
	}

	private void isPalidrome(String str) {

		String reversed = reverseString(str);

		System.out.println(reversed);

		if (reversed.equalsIgnoreCase(str)) {

			flag = true;

		} else {

			flag = false;
		}

		System.out.println("Is " + str + " a palidrome? " + flag);

	}

	// Overloaded method

	void isPalidrome(String str_1, int a) {

		String reversed = reverseString(str_1);

		System.out.println(reversed);

		if (reversed.equalsIgnoreCase(str_1)) {

			flag = true;

		} else {

			flag = false;
		}

		System.out.println("Is " + str_1 + " a palidrome? " + flag);

	}

	// Overloaded method
	protected void isPalidrome(String str_2, int a, int b) {

		String reversed = reverseString(str_2);

		System.out.println(reversed);

		if (reversed.equalsIgnoreCase(str_2)) {

			flag = true;

		}

		else {

			flag = false;
		}

		System.out.println("Is " + str_2 + " a palidrome? " + flag);

	}

	// Overloaded method
	public void isPalidrome(String str_3, int a, int b, int c) {

		String reversed = reverseString(str_3);

		System.out.println(reversed);

		if (reversed.equalsIgnoreCase(str_3)) {

			flag = true;
		}

		else {

			flag = false;
		}

		System.out.println("Is " + str_3 + " a palidrome? " + flag);
	}

	public static void main(String[] args) {

		AccessModifiers_with_Palidrome obj = new AccessModifiers_with_Palidrome();

		obj.isPalidrome("MadAmL");
		obj.isPalidrome("MaDAM", 0);
		obj.isPalidrome("Welcome", 0, 1);
		obj.isPalidrome("NoN", 0, 0, 0);

	}

}
