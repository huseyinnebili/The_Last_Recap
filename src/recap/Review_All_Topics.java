package recap;

public class Review_All_Topics {

	public int[] find_numbers(int prime, int max, int min, int sec_max, int even, int odd) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		System.out.print("The prime number of the list = ");

		for (int i = 0; i < nums.length; i++) {

			int count = 0;

			if (nums[i] == 0 || nums[i] == 1) {

				continue;
			}

			for (int j = 2; j < i - 1; j++) {

				if (nums[i] % j == 0) {

					count = count + 1;

				}

			}

			if (count == 0) {

				System.out.print(nums[i] + ",");
			}
		}

		System.out.println();

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > max) {

				max = nums[i];
			}
		}
		System.out.println("The maximum number of the array list = " + max);

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > sec_max && nums[i] < max) {

				sec_max = nums[i];
			}
		}

		System.out.println("The second maximum number of the array list = " + sec_max);

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] < min) {

				min = nums[i];
			}
		}

		System.out.println("The minimum number of the array list = " + min);

		System.out.print("The even numbers of array list = ");
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

		return nums;
	}

	public String manipulation(String str, String str_2) {

		System.out.println("The lenght of the String = " + str.length());
		System.out.println("The index of the first character of the String = " + str.indexOf('T'));
		System.out.println("The index of the 'o' character of the String = " + str.indexOf('o'));
		System.out.println(
				"The index of the second 'o' character of the String = " + str.indexOf('o', str.indexOf('o') + 1));
		System.out.println("The index of the first 'd' character of the String = " + str.indexOf('d'));
		System.out.println(
				"The index of the second 'o'character of the String = " + str.indexOf('d', str.indexOf('d') + 1));
		System.out.println("The actual first String = " + str);
		System.out.println("The actual second String = " + str_2);
		System.out.println("The first is equal to second String = " + str.equals(str_2));
		System.out.println("The first is equal to second String = " + str.equalsIgnoreCase(str_2));
		System.out.println("The first String after toUpperCase = " + str.toUpperCase());
		System.out.println("The second String after toUpperCase = " + str_2.toUpperCase());
		System.out.println("The first String after toLowerCase = " + str.toLowerCase());
		System.out.println("The second String after toLowerCase = " + str_2.toLowerCase());
		System.out.println("The first String after toLowerCase is equal the second String after toLowerCase = "
				+ str.toLowerCase().equals(str_2.toLowerCase()));

		System.out.print("Reverse of the String with toCharArray() = ");

		String reverse = "";

		char[] ch = str.toCharArray();

		for (int i = str.length() - 1; i >= 0; i--) {

			reverse = reverse + ch[i];
		}

		System.out.print(reverse);
		System.out.println();

		System.out.print("Reverse of the String with charAt()index = ");

		String reverse_2 = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			char ch_2 = str.charAt(i);

			reverse_2 = reverse_2 + ch_2;

		}

		System.out.print(reverse_2);

		System.out.println();

		System.out.print("Reverse of the String with split() = ");

		String reverse_3 = "";

		String[] strng = str.split("");

		for (int i = strng.length - 1; i >= 0; i--) {

			reverse_3 = reverse_3 + strng[i];
		}

		System.out.print(reverse_3);

		System.out.println();

		System.out.print("Reverse of the String with substring= ");

		String reverse_4 = "";

		for (int i = str.length(); i > 0; i--) {

			reverse_4 = reverse_4 + str.substring(i - 1, i);
		}

		System.out.print(reverse_4);

		System.out.println();
		return str;

	}

	public int print_star_pattern(int a) {

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
		
		for(int i=0;i<a;i++  ) {
			
			for(int j=2*(a-i);j>0;j--) {
				
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++) {
				
				System.out.print("* ");
			}
			
			System.out.println();
		}

		for(int i=a;i>0;i--) {
			
			
			for(int j=2*(a-i);j>0;j--) {
				
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++) {
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		for(int i =0;i<a;i++) {
			
			for(int j=a-i; j>0;j--) {
				
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++) {
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
			
		for(int i=a;i>0;i--) {
			
			for(int j=a-i;j>0;j--) {
				
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++) {
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
			
		return a;
	}
}
