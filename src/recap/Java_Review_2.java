package recap;

public class Java_Review_2 {

	protected int addion(int a, int b) {

		System.out.println("The sum of " + a + " and " + b + " = " + (a + b));

		return a + b;
	}

	protected int multiply(int a, int b) {

		System.out.println("The multiplication of " + a + " and " + b + " = " + a * b);

		return a * b;
	}

	public int division(int a, int b) {

		System.out.println("The division of " + a + " and " + b + " = " + a / b);

		return a / b;
	}

	public int substraction(int a, int b) {

		System.out.println("The substraction of " + a + " and " + b + " = " + (a - b));

		return a - b;
	}

	protected int[] max_and_sec_min_num(int max, int sec_max, int min) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > max) {

				max = nums[i];
			}
		}

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] < min) {

				min = nums[i];
			}
		}

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > sec_max && nums[i] < max) {

				sec_max = nums[i];
			}
		}

		System.out.println("The maximum number of the array list = " + max);
		System.out.println("The second maximum number of the array list = " + sec_max);
		System.out.println("The minumum number of the array list = " + min);

		return nums;
	}

	protected int[] prime_num(int prime) {

		int[] nums = { 121, 20, 34, 44, 55, 6, 7, 8, 9, 0, 10, 11, 12, 13, 14, 15, 16, 17 };

		System.out.print("The prime numbers of the array list = ");

		for (int i = 0; i < nums.length; i++) {

			int count = 0;

			if (nums[i] == 0 || nums[i] == 1) {

				continue;
			}

			for (int j = 2; j < nums[i]/2; j++) {

				if (nums[i] % j == 0) {

					count = count + 1;
				}
			}

			if (count == 0) {

				System.out.print(nums[i] + ",");
			}
		}

		return nums;
	}

	protected int[] even_num(int even) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 10, 11, 12, 13, 14, 15, 16, 17 };

		System.out.println();

		System.out.print("The even numbers of the array list = ");

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 == 0) {

				System.out.print(nums[i] + ",");
			}
		}

		return nums;
	}

	protected int[] odd_num(int odd) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 10, 11, 12, 13, 14, 15, 16, 17 };

		System.out.println();

		System.out.print("The odd numbers of the array list = ");

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 != 0) {

				System.out.print(nums[i] + ",");
			}
		}

		return nums;
	}

	public String manipulation(String str, String str_2) {

		System.out.println();

		System.out.println("The index of the first character of the String = " + str.indexOf('T'));
		System.out.println("The index of the first 'o' of the String = " + str.indexOf('o'));
		System.out.println("The index of the second 'o' of the String = " + str.indexOf('o', str.indexOf('o') + 1));
		System.out.println("The characters of between index 3 to 10 = " + str.substring(3, 10));
		System.out.println("The orjinal String =" + str);
		System.out.println("The String after uppercase = " + str.toUpperCase());
		System.out.println("The String after lowercase = " + str.toLowerCase());
		System.out.println("Is str equal to str_2 = " + str.equals(str_2));
		System.out
				.println("Is str equal to str_2 after manipulation = " + str.toLowerCase().equals(str_2.toLowerCase()));

		return str;
	}

	public String reverse_with_split(String str) {

		String reverse_1 = "";

		String[] strr = str.split("");

		for (int i = strr.length - 1; i >= 0; i--) {

			reverse_1 = reverse_1 + strr[i];

		}
		System.out.println("The orjinal String = " + str);
		System.out.println("The reverse of the String = " + reverse_1);

		return str;
	}

	protected String reverse_with_charAt(String str, char ch) {

		String reverse_2 = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			ch = str.charAt(i);

			reverse_2 = reverse_2 + ch;
		}

		System.out.println("The lenght of String = " + str.length());
		System.out.println("The orjinal String = " + str);
		System.out.println("The reverse of the String with charAt(index)= " + reverse_2);
		System.out.println("Is the lenght of reversed String = " + reverse_2.length());

		return str;
	}

	public String reverse_with_toCharArray(String str) {

		String reverse_3 = "";

		char[] ch = str.toCharArray();

		for (int i = str.length() - 1; i >= 0; i--) {

			reverse_3 = reverse_3 + ch[i];
		}

		System.out.println("The reverse of the String =" + reverse_3);

		return str;
	}

	public String reverse_with_substring(String str) {

		String reverse_4 = "";

		for (int i = str.length(); i > 0; i--) {

			reverse_4 = reverse_4 + str.substring(i - 1, i);
		}

		System.out.println("The reverse of the String =" + reverse_4);

		return str;
	}

	public char[] convert_String(String str) {

		char[] ch = { 'W', 'e', 'l', 'c', 'o', 'm', 'e', '!' };

		for (int i = 0; i < ch.length; i++) {

			str = String.valueOf(ch);

		}
		System.out.println(str);

		return ch;
	}

	public char[] convert_String_2(String str) {

		char[] ch = { 'W', 'e', 'l', 'c', 'o', 'm', 'e', ' ', 'g', 'u', 'y', 's', '.', '!' };

		for (int i = 0; i < ch.length; i++) {

			str = new String(ch);

		}

		System.out.print(str);
		System.out.println();

		return ch;
	}

	protected int print_pattern_star(int a) {

		for (int i = 0; i < a; i++) {

			for (int j = 0; j < i; j++) {

				System.out.print(" * ");
			}

			System.out.println();
		}

		for (int i = a; i > 0; i--) {

			for (int j = 0; j < i; j++) {

				System.out.print(" * ");
			}

			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < a; i++) {

			for (int j = 2 * (a - i); j > 0; j--) {

				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {

				System.out.print("* ");
			}

			System.out.println();

		}

		for (int i = a; i > 0; i--) {

			for (int j = 2 * (a - i); j > 0; j--) {

				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < a; i++) {

			for (int j = a - i; j > 0; j--) {

				System.out.print(" ");

			}

			for (int j = 0; j < i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}

		for (int i = a; i > 0; i--) {

			for (int j = a - i; j > 0; j--) {

				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}
		return a;
	}

	protected String palidrome_substring(String str, String reverse) {

		for (int i = str.length(); i > 0; i--) {

			reverse = reverse + str.substring(i - 1, i);
		}

		if (str.equalsIgnoreCase(reverse)) {

			System.out.println("The String is a palidrome.");
		} else {

			System.out.println("The String is not a palidrome.");
		}

		return reverse;

	}
	
	public String palidrome_split(String str,String reverse) {
		
		String []array=str.split("");
		
		for(int i=array.length-1;i>=0;i--) {
			
			reverse=reverse+array[i];
		}
		
		if (str.equalsIgnoreCase(reverse)) {

			System.out.println("The String is a palidrome.");
		} else {

			System.out.println("The String is not a palidrome.");
		}
		
		
		
		return str;
	}
	
 public String palidrome_CharArray(String str,String reverse) {
		

          char []ch=str.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			
			reverse=reverse+ch[i];
		}
		
		if (str.equalsIgnoreCase(reverse)) {

			System.out.println("The String is a palidrome.");
		} else {

			System.out.println("The String is not a palidrome.");
		}
		
		
		
		return str;
	
}
 
}