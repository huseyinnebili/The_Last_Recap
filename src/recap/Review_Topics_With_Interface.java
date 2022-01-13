package recap;

public interface Review_Topics_With_Interface {

	public void calculate(int max_num, int sec_max_num, int min, int sum, int avg_num);

	public void findNumber(int prime, int odd_num, int even_num);

	public void manipulate(String str_1, String str_2);

	public void converting();

	public void isPalidrome(String str);

	public void switch_Countries(String country);

}

class Main implements Review_Topics_With_Interface {

	@Override
	public void calculate(int max_num, int sec_max_num, int min_num, int sum, int avg_num) {

		int[] nums = { 12, 34, 46, 23, 75, 43, 21, 93, 123, 432, 532, 5, 78 };

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > max_num) {

				max_num = nums[i];

			}

		}

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > sec_max_num && nums[i] < max_num) {

				sec_max_num = nums[i];
			}
		}

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] < min_num) {

				min_num = nums[i];
			}
		}

		for (int i = 0; i < nums.length; i++) {

			sum = sum + nums[i];

			avg_num = sum / nums.length;
		}

		System.out.println("The maximum number of the array list is " + max_num + ".");
		System.out.println("The second maximum number of the array list is " + sec_max_num + ".");
		System.out.println("The minumum number of the array list is " + min_num + ".");
		System.out.println("The sum of the array list number is " + sum + ".");
		System.out.println("The average of the array list number is " + avg_num + ".");
	}

	@Override
	public void findNumber(int prime, int odd_num, int even_num) {

		int[] nums = { 12, 34, 46, 23, 75, 43, 21, 93, 123, 432, 532, 5, 78, 71 };

		System.out.print("The prime numbers of the array list = ");

		for (int i = 0; i < nums.length; i++) {

			int count = 0;

			for (int j = 2; j < nums[i] / 2; j++) {

				if (nums[i] % j == 0) {

					count = count + 1;
				}
			}
			if (count == 0) {

				System.out.print(nums[i] + " ");
			}
		}

		System.out.println();
		System.out.print("The odd numbers of the array list = ");

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 != 0) {

				System.out.print(nums[i] + " ");
			}
		}

		System.out.println();
		System.out.print("The even numbers of the array list = ");

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 == 0) {

				System.out.print(nums[i] + " ");
			}
		}
	}

	@Override
	public void manipulate(String str_1, String str_2) {

		System.out.println();

		System.out.println(str_1.equals(str_2));

		System.out.println(str_1.toUpperCase());

		System.out.println(str_2.toLowerCase());

		System.out.println(str_1.indexOf('o', 5));

		System.out.println(str_2.indexOf('y', 8));

		System.out.println(str_2.substring(1, 5));

		System.out.print("The reverse of str_1 with CharArray() method = ");

		String reverse_1 = "";

		char[] ch = str_1.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {

			reverse_1 = reverse_1 + ch[i];

		}

		System.out.print(reverse_1);

		System.out.println();

		System.out.print("The reverse of str_1 with charAt(i) method = ");

		String reverse_2 = "";

		for (int i = str_1.length() - 1; i >= 0; i--) {

			reverse_2 = reverse_2 + str_1.charAt(i);

		}

		System.out.print(reverse_2);

		System.out.println();

		System.out.print("The reverse of str_1 with split() method = ");

		String reverse_3 = "";

		String[] str = str_2.split(" ");

		for (int i = str.length - 1; i >= 0; i--) {

			reverse_3 = reverse_3 + str[i];
		}

		System.out.print(reverse_3);

		System.out.println();

		System.out.print("The reverse of str_1 with substring = ");

		String reverse_4 = "";

		for (int i = str_2.length(); i > 0; i--) {

			reverse_4 = reverse_4 + str_2.substring(i - 1, i);
		}

		System.out.print(reverse_4);

		System.out.println();

		System.out.print("The converting of str_1 to char array through toCharArray() method = ");

		char[] ch_2 = str_2.toCharArray();

		for (int i = 0; i < ch_2.length; i++) {

			System.out.print(ch_2[i] + "  ");

		}

		System.out.println();
	}

	@Override
	public void converting() {

		char[] ch = { 'W', 'e', 'l', 'c', 'o', 'm', 'e', ' ', 'G', 'u', 'y', 's', '!' };

		String str = new String(ch);

		System.out.println(str);

		String str_2 = String.valueOf(ch);

		System.out.println(str_2);
	}

	@Override
	public void isPalidrome(String str) {

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			reverse = reverse + str.charAt(i);

		}

		if (reverse.equalsIgnoreCase(str)) {

			System.out.println(str + " is a palidrome.");

		}

		else {

			System.out.println(str + " is not a palidrome.");

		}

	}

	@Override
	public void switch_Countries(String country) {
		
		String capitol; 
		
		switch(country) {
		
		case "USA":
			
			capitol="Washington";
			
			break;
			
		case "England":
			
			capitol="London";
			
			break;
			
		case "Italy":
			
			capitol="Roma";
			
			break;
			
		case "Canada":
			
			capitol="Ottowa";
			
			break;
			
		case "Germany":
			
			capitol="Berlin";
			
			break;
			
		default:
			
			capitol ="Unknown";
			
			break;
		}
		 
		System.out.println("The capitol of "+country+" is "+capitol+".");

	}

}
