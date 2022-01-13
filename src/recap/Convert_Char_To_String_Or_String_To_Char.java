package recap;

public class Convert_Char_To_String_Or_String_To_Char {

	char[] ch = { 'W', 'e', 'l', 'c', 'o', 'm', 'e' };

	String string = "Today is Coding day";

	public void convert_with_creating_string_obj() {

		String str = new String(ch);

		System.out.println("It was converted to String with creating String object = " + str);
	}

	public void convert_with_value_of_method() {

		String str = String.valueOf(ch);

		System.out.println("It was converted to String with ValueOf() = " + str);
	}

	public void convert_with_CharArray() {

		System.out.print("It was converted to char with CharArray() = ");

		char[] ch = string.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			System.out.print(ch[i] + "  ");
		}

	}

	public void convert_with_charAt() {

		System.out.println();

		System.out.print("It was converted to char with charAt(index) = ");

		for (int i = 0; i < string.length(); i++) {

			char ch = string.charAt(i);

			System.out.print(ch + "  ");
		}

	}

	public static void main(String[] args) {

		Convert_Char_To_String_Or_String_To_Char obj = new Convert_Char_To_String_Or_String_To_Char();

		obj.convert_with_creating_string_obj();
		obj.convert_with_value_of_method();
		obj.convert_with_CharArray();
		obj.convert_with_charAt();

	}
}
