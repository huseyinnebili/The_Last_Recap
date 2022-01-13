package recap;

public class Manipulation_String_Encapsulation {

	private String palindrome, str_1, str_2, str_3, str_4;

	public String reverse_1 = "";
	public String reverse_2 = "";
	public String reverse_3 = "";
	public String reverse_4 = "";

	public String getPalindrome() {
		return palindrome;
	}

	public void setPalindrome(String palindrome) {

		String str = "Dod";
		String reverse = "";
		boolean isPalindrome = false;

		for (int i = str.length() - 1; i >= 0; i--) {

			char ch = str.charAt(i);

			reverse = reverse + ch;

			if (reverse.equalsIgnoreCase(str)) {

				isPalindrome = true;

				this.palindrome = palindrome;

			}

		}
		System.out.println(isPalindrome);

	}

	public String getStr_1() {

		if (!reverse_1.equalsIgnoreCase(str_1)) {

			System.out.println("The reverse of the first String with split() = " + reverse_1);
		}

		System.out.print("The first String entered = ");

		return str_1;
	}

	public void setStr_1(String str_1) {

		String[] strng = str_1.split("");

		for (int i = strng.length - 1; i >= 0; i--) {

			reverse_1 = reverse_1 + strng[i];
		}

		if (reverse_1.equalsIgnoreCase(str_1)) {

			System.out.println("The reverse of the first String with split() = " + reverse_1);

		} else {

			this.str_1 = str_1;
		}

	}

	public String getStr_2() {

		if (!reverse_2.equalsIgnoreCase(str_2)) {

			System.out.println("The reverse of the second String with charAt(index) = " + reverse_2);
		}

		System.out.print("The second String entered = ");

		return str_2;
	}

	public void setStr_2(String str_2) {

		for (int i = str_2.length() - 1; i >= 0; i--) {

			char ch = str_2.charAt(i);

			reverse_2 = reverse_2 + ch;
		}

		if (reverse_2.equalsIgnoreCase(str_2)) {

			System.out.println("The reverse of the second String with charAt(index) = " + reverse_2);

		} else {

			this.str_2 = str_2;
		}

	}

	public String getStr_3() {

		if (!reverse_3.equalsIgnoreCase(str_3)) {

			System.out.println("The reverse of the third String with CharArray() = " + reverse_3);
		}

		System.out.print("The third String entered = ");

		return str_3;
	}

	public void setStr_3(String str_3) {

		char[] ch = str_3.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {

			reverse_3 = reverse_3 + ch[i];

			if (reverse_3.equalsIgnoreCase(str_3)) {

				System.out.println("The reverse of the third String with CharArray() = " + reverse_3);

			} else {

				this.str_3 = str_3;
			}
		}

	}

	public String getStr_4() {

		if (!reverse_4.equalsIgnoreCase(str_4)) {

			System.out.println("The reverse of the fourth String with substring() = " + reverse_4);
		}

		System.out.print("The fourth String entered = ");

		return str_4;
	}

	public void setStr_4(String str_4) {

		for (int i = str_4.length(); i > 0; i--) {

			reverse_4 = reverse_4 + str_4.substring(i - 1, i);
		}

		if (reverse_4.equalsIgnoreCase(str_4)) {

			System.out.println("The reverse of the fourth String with substring() = " + reverse_4);

		} else {

			this.str_4 = str_4;
		}

	}

}
