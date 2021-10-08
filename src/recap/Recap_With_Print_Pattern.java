package recap;

import java.util.Scanner;

public class Recap_With_Print_Pattern {

	static Scanner scan;

	public void calculator(int a, int b) {

		System.out.println("Sum of " + a + " and " + b + " = " + (a + b));
		System.out.println("Division of " + a + " and " + b + " = " + (a / b));
		System.out.println("Multiply of " + a + " and " + b + " = " + (a * b));
		System.out.println("Substract of " + a + " and " + b + " = " + (a - b));

	}

	public int[] find_Number(int max_num, int sec_max_num, int min_num, int prime_num, int even_num, int odd_num) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		System.out.print("The numbers of the array list = ");

		for (int i = 0; i < nums.length; i++) {

			System.out.print(nums[i] + ",");
		}

		System.out.println();
		System.out.print("The prime numbers of the array list = ");

		for (int i = 0; i < nums.length; i++) {

			int count = 0;

			if (nums[i] == 0 || nums[i] == 1) {

				continue;
			}

			for (int j = 2; j < nums[i] ; j++) {

				if (nums[i] % j == 0) {

					count = count + 1;
				}
			}
			if (count == 0) {

				System.out.print(nums[i] + ",");
			}
		}

		System.out.println();
		System.out.print("The even numbers of the array list = ");

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 == 0) {

				System.out.print(nums[i] + ",");
			}

		}

		System.out.println();
		System.out.print("The odd numbers of the array list = ");

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 != 0) {

				System.out.print(nums[i] + ",");
			}

		}

		System.out.println();

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > max_num) {

				max_num = nums[i];
			}
		}

		System.out.println("The maximum number of the array list = " + max_num);

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] < min_num) {

				min_num = nums[i];
			}

		}

		System.out.println("The minumum number of the array list = " + min_num);

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] < max_num && nums[i] > sec_max_num) {

				sec_max_num = nums[i];
			}

		}

		System.out.println("The second maximum number of the array list = " + sec_max_num);

		return nums;

	}

	void manipulation(String str, String str2, String str3, String str4, String str5) {

		System.out.println("The lenght of the first String = " + str.length());
		System.out.println("The lenght of the second String = " + str.length());
		System.out.println("The 3th.charecter of first String = " + str.charAt(2));
		System.out.println("The index of 's' character of the first String = " + str.indexOf('s'));
		System.out.println("The index of 'o' character of the first String = " + str.indexOf('o'));
		System.out.println("The index of 2nd. 'o' character of the first String = " + (str.indexOf('o',str.indexOf('o') + 1)));
		System.out.println("The index of 'my' keyword of the first String = " + str.indexOf("my"));
		System.out.println("The index of 'hello' keyword of the first String = " + str.indexOf("hello"));
		System.out.println("The index of compare of equality of both Strings = " + (str.equals(str2)));
		System.out.println("The index of compare of equality of both Strings = " + (str.equalsIgnoreCase(str2)));
		System.out.println("The beginning and ending index of the first String = " + str.substring(0, 19));
		System.out.println("The 3th. String = " + str3);
		System.out.println("The 3th.String after trim = " + str3.trim());
		System.out.println("The 3th.String after replacing = " + str3.replace('W', 'w'));

		String[] st = str3.split("");

		for (int i = 0; i < st.length; i++) {

			System.out.print(st[i] + " ");

		}
		System.out.println();
		System.out.println("From uppercase to lowercase = " + str2.toLowerCase());
		System.out.println("From lowercase to uppercase = " + str.toUpperCase());
		System.out.println(str.equals(str2.toLowerCase()));
		System.out.println("After concating two Strings = " + str4.concat(str5));

		System.out.print("Reverse with toCharArray = ");

		char[] ch = str.toCharArray();

		String reverse = "";
		for (int i = ch.length - 1; i >= 0; i--) {

			reverse = reverse + ch[i];

		}

		System.out.print(reverse);

		String reverse_2 = "";
		System.out.println();
		System.out.print("Reverse with charAt(index) = ");

		for (int i = str.length() - 1; i >= 0; i--) {

			char chr = str.charAt(i);

			reverse_2 = reverse_2 + chr;
		}

		System.out.print(reverse_2);

		String reverse_3 = "";
		System.out.println();
		System.out.print("Reverse with split() = ");

		String[] srt = str.split("");

		for (int i = str.length() - 1; i >= 0; i--) {

			reverse_3 = reverse_3 + srt[i];
		}

		System.out.print(reverse_3);

		String reverse_4 = "";
		System.out.println();
		System.out.print("Reverse with split() = ");

		for (int i = str.length(); i > 0; i--) {

			reverse_4 = reverse_4 + str.substring(i - 1, i);
		}

		System.out.print(reverse_4);
	}

	void print_Pyramid_Pattern(int a) {

		System.out.println();

		for (int i = 0; i < a; i++) {

			for (int j = a - i; j > 1; j--) {

				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}
	}

	void print_Left_Triangle_Pattern(int a) {

		System.out.println();

		for (int i = 0; i < a; i++) {

			for (int j = 2 * (a - i); j > 2; j--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}

	}

	void print_Righ_Triangle_Pattern(int a) {

		System.out.println();
		
		for (int i = 0; i < a; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	void print_Righ_Triangle_Pattern_2(int a) {

		for (int i = a; i>= 0; i--) {

			for (int j = 0; j <= i; j++) {

				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	

	public static void main(String[] args) {

		Recap_With_Print_Pattern obj = new Recap_With_Print_Pattern();

		obj.calculator(10, 5);
		obj.find_Number(0, 0, 1, 0, 0, 0);
		obj.manipulation("Today is my off day", "Today is my Off day", "   Hello World    ", "Welcome", " Guys");
		obj.print_Pyramid_Pattern(6);
		obj.print_Left_Triangle_Pattern(6);
		obj.print_Righ_Triangle_Pattern(6);
		obj.print_Righ_Triangle_Pattern_2(6);
	}

}
