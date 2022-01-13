package recap;

import java.util.Scanner;

public class Java_Review_3 {

	public Java_Review_3() {

		System.out.println("We will review all topics learning as of today.");
	}

	protected int[] calculator(int sum, int sub, int mul, double div) {  //default method can be accessed from another class at the same package.

		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < nums.length; i++) {

			sum = sum + nums[i];
		}

		System.out.println("The sum of array list = " + sum);

		for (int i = 0; i < nums.length; i++) {

			sub = sub - nums[i];
		}

		System.out.println("The substraction of array list = " + sub);

		for (int i = 0; i < nums.length; i++) {

			mul = mul * nums[i];
		}

		System.out.println("The multiplication of array list = " + mul);

		for (int i = 0; i < nums.length; i++) {

			div = div / nums[i];
		}

		System.out.println("The division of array list = " + div);

		return nums;
	}

	protected int[] find_numbers(int prime, int even, int odd, int max, int sec_max, int min) { //protected method can be accessed from another class at the same package.

		int[] nums = { 161, 20, 33, 41, 53, 65, 7, 8, 9, 0 };

		System.out.print("The prime numbers of array list = ");

		for (int i = 0; i < nums.length; i++) {

			int count = 0;

			if (nums[i] == 0 || nums[i] == 1) {

				continue;
			}

			for (int j = 2; j <=nums[i]/2; j++) {

				if (nums[i] % j == 0) {

					count = count + 1;
				}

			}

			if (count == 0) {

				System.out.print(nums[i] + ",");
			}
		}

		System.out.println();

		System.out.print("The even number of array list = ");

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 == 0) {

				System.out.print(nums[i] + ",");
			}
		}

		System.out.println();

		System.out.print("The odd number of array list = ");

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 != 0) {

				System.out.print(nums[i] + ",");
			}
		}

		System.out.println();

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > max) {

				max = nums[i];
			}
		}

		System.out.println("The maximum number of array list = " + max);

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] < max && nums[i] > sec_max) {

				sec_max = nums[i];
			}

		}

		System.out.println("The second maximum number of array list = " + sec_max);

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] < min) {

				min = nums[i];
			}
		}

		System.out.println("The minumum number of array list = " + min);

		return nums;
	}

	public String manipulation(String str_1, String str_2) {  //public method can be accessed from another class at the same package.

		System.out.println("The index of the character 'o' = " + str_1.indexOf('o'));
		System.out.println("The index of the second character 'o' = " + str_1.indexOf('o', str_1.indexOf('o') + 1));
		System.out.println("Is the first String equal to the second String = " + str_1.equals(str_2));
		System.out.println("Is the first String equal to the second String = " + str_1.equalsIgnoreCase(str_2));
		System.out.println("The first String after uppercase = " + str_1.toUpperCase());
		System.out.println("The second String after lowercase = " + str_2.toLowerCase());
		System.out.println("The characters of between first index to fifth index = " + str_1.substring(0, 5));

		System.out.print("The reverse of String with split() = ");

		String reverse_1 = "";

		String[] str = str_1.split("");

		for (int i = str.length - 1; i >= 0; i--) {

			reverse_1 = reverse_1 + str[i];

		}

		System.out.print(reverse_1);

		System.out.println();

		System.out.print("The reverse of String with toCharArray() = ");

		char[] ch = str_1.toCharArray();

		String reverse_2 = "";

		for (int i = ch.length - 1; i >= 0; i--) {

			reverse_2 = reverse_2 + ch[i];
		}
		System.out.print(reverse_2);

		System.out.println();

		System.out.print("The reverse of String with charAt(index) = ");

		String reverse_3 = "";

		for (int i = str_1.length() - 1; i >= 0; i--) {

			char chr = str_1.charAt(i);

			reverse_3 = reverse_3 + chr;
		}
		System.out.print(reverse_3);

		System.out.println();

		System.out.print("The reverse of String with substring = ");

		String reverse_4 = "";

		for (int i = str_1.length(); i > 0; i--) {

			reverse_4 = reverse_4 + str_1.substring(i - 1, i);
		}

		System.out.print(reverse_4);

		return str_1;

	}

	public int print_star_patern(int a) {

		System.out.println();

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

	protected int display_with_do(int a) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please type your sentence!");

		String text = scan.nextLine();

		do {

			System.out.println(text);

			a++;

		} while (a < 5);

		return a;

	}

	public String isPalidrome(String str, String reverse) {

		for (int i = str.length(); i > 0; i--) {

			reverse = reverse + str.substring(i - 1, i);

		}

		if (reverse.equalsIgnoreCase(str)) {

			System.out.println("The String is a palidrome.");
		} else {
			System.out.println("The String is not a palidrome.");
		}

		return str;
	}

	
	public void  display(String country,String capitol) {
		
		switch(country){
		
		case "USA":
			
			capitol="Washington";
			
			break;
			
		case "UK":
			
			capitol="London";
			
			break;
			
		case "TC":
			
			capitol="Ankara";
			
			break;
			
		case "Germany":
			
			capitol="Berlin";
			
			break;
			
		case "France":
			
			capitol="Paris";
			
			break;
			
		default:
			
			capitol="Unknown";
				
				break;
			
			
		
		
		}
		
		System.out.println("The capitol of "+country+" is "+capitol+".");
		
	}
	public static void main(String[] args) {

		Java_Review_3 obj = new Java_Review_3();

		obj.calculator(0, 0, 1, 1);
		obj.find_numbers(0, 0, 0, 0, 0, 1);
		obj.manipulation("Today is Coding daY", "Today is coding day");
		obj.print_star_patern(6);
		obj.display_with_do(0);
		obj.isPalidrome("Dod", "");
		obj.display("USA", " ");
		

	}
}
