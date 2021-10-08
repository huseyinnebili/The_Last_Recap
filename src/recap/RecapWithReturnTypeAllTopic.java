package recap;


import java.util.Scanner;

public class RecapWithReturnTypeAllTopic {

	static Scanner scan;

	int addition(int a, int b) {

		System.out.println("Sum of " + a + " and " + b + " = " + (a + b));

		return a + b;
	}

	int substraction(int a, int b) {

		System.out.println("Substract of " + a + " and " + b + " = " + (a - b));

		return a - b;
	}

	int multiplication(int a, int b) {

		System.out.println("Multiply of " + a + " and " + b + " = " + (a * b));

		return a * b;
	}

	int division(int a, int b) {

		System.out.println("Division of " + a + " and " + b + " = " + (a / b));

		return a / b;
	}

	int[] find_Number(int max_num, int min_num, int sec_max, int prime_Num, int even_Num, int odd_Num) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		System.out.print("The numbers of array list = ");

		for (int i = 0; i < nums.length; i++) {

			System.out.print(nums[i] + ",");
		}

		System.out.println();
		System.out.print("Prime number of the array list = ");

		for (int i = 0; i < nums.length; i++) {
			int count = 0;

			if (nums[i] == 0 || nums[i] == 1) {

				continue;
			}

			for (int j = 2; j < nums[i] - 1; j++) {

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

			if (nums[i] > max_num) {

				max_num = nums[i];
			}

		}
		System.out.println("Maximum number of the array list = " + max_num);

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > min_num && nums[i] < max_num) {

				sec_max = nums[i];
			}

		}
		System.out.println("Second maximum number of the array list = " + sec_max);

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] < min_num) {

				min_num = nums[i];
			}

		}
		System.out.println("Minumum number of the array list = " + min_num);

		System.out.print("Even number of the array list = ");

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 == 0) {

				System.out.print(nums[i] + ",");
			}

		}

		System.out.println();
		System.out.print("Odd number of the array list = ");

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 != 0) {

				System.out.print(nums[i] + ",");
			}

		}
		System.out.println();
		return nums;
	}

	String manupilation(String str, String reverse) {

		System.out.println("String = " + str);

		for (int i = str.length() - 1; i >= 0; i--) {

			char ch = str.charAt(i);

			reverse = reverse + ch;
		}

		System.out.print("The reverse of " + str + " with charAt(index) is = " + reverse);
		System.out.println();

		reverse = "";
		char[] ch = str.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {

			reverse = reverse + ch[i];
		}

		System.out.print("The reverse of " + str + " with charArray()to is = " + reverse);
		System.out.println();

		reverse = "";
		String[] rev = str.split("");

		for (int i = rev.length - 1; i >= 0; i--) {

			reverse = reverse + rev[i];
		}

		System.out.print("The reverse of " + str + " with split() is = " + reverse);

		System.out.println();

		reverse = "";

		for (int i = str.length(); i > 0; i--) {

			reverse = reverse + str.substring(i - 1, i);
		}

		System.out.print("The reverse of " + str + " with substring() is = " + reverse);

		System.out.println();

		return str;

	}

	boolean isPalidrome(String str, String reverse) {

		for (int i = str.length() - 1; i >= 0; i--) {

			char ch = str.charAt(i);
			reverse = reverse + ch;

		}
		if (str.equalsIgnoreCase(reverse)) {

			System.out.println(str + " is a palidrome.");
		} else {
			System.out.println(str + " is not a palidrome.");
		}

		return true;

	}

	String display_Capitol(String country, String capitol) {

		switch (country) {

		case "USA":

			capitol = "Washington";

			break;

		case "UK":

			capitol = "London";

			break;

		case "TC":

			capitol = "Ankara";

			break;

		case "Canada":

			capitol = "Ottowa";

			break;

		case "Italy":

			capitol = "Roma";

			break;

		case "France":

			capitol = "Paris";

			break;

		default:

			capitol = "Unknown";

			break;
		}

		System.out.println("The capitol of " + country + " is " + capitol);

		return country;

	}

	String display_Do_List(String browser, int a) {

		do {

			System.out.println("Please enter a browser name to navigate to URL.");
			scan = new Scanner(System.in);

			browser = scan.nextLine();

			if (browser.equalsIgnoreCase("chrome")) {

				System.out.println("You will navigate to URL by chrome.driver");

				break;

			} else if (browser.equalsIgnoreCase("firefox")) {

				System.out.println("You will navigate to URL by gecko.driver.");

				break;

			} else if (browser.equalsIgnoreCase("edge")) {

				System.out.println("You will navigate to URL by edge.driver.");

				break;

			} else {

				System.out.println("Unknown browser.Please random one more time.");
			}

			a++;

		} while (a < 3);

		System.out.println("Congrats!You enter a correct browser.");

		return browser;

	}

	char[] convert_String() {

		char[] list = { 'W', 'E', 'L', 'C', 'O', 'M', 'E' };

		System.out.print("List of the char array = ");
		
		for(int i=0;i<list.length;i++) {
			
			System.out.print(list[i]+",");
		}
		String convert = String.valueOf(list);

		System.out.println();
		System.out.println("The convert of the char array to String = "+convert);

		return list;
	}

	public static void main(String[] args) {

		RecapWithReturnTypeAllTopic obj = new RecapWithReturnTypeAllTopic();

		obj.addition(10, 5);
		obj.substraction(10, 5);
		obj.division(10, 5);
		obj.multiplication(10, 5);
		obj.find_Number(0, 2, 0, 2, 0, 0);
		obj.manupilation("Welcome", "");
		obj.isPalidrome("Dode", "");
		obj.display_Capitol("USA", "");
		obj.display_Do_List("", 0);
		obj.convert_String();
	}

}