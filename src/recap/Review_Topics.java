package recap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Review_Topics {

	double price;
	double payment;
	double total_payment;

	public int[] find_numbers(int max, int sec_max, int min, int even) {

		int[] nums = { 3, 34, 54, 23, 15, 67, 98, 123, 31, 43 };

		System.out.print("The prime number of array list = ");

		int a = 0;
		double sum = 0;

		for (int i = 0; i < nums.length; i++) {

			int count = 0;

			if (nums[i] == 0 || nums[i] == 1) {

				continue;

			}

			for (int j = 2; j < nums[i] / 2; j++) {

				if (nums[i] % j == 0) {

					count = count + 1;
				}
			}

			if (count == 0) {

				System.out.print(nums[i] + ",");

				sum = sum + nums[i];

				a++;
			}

		}

		System.out.println();

		System.out.println("The average of prime numbers = " + sum / a);

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > max) {

				max = nums[i];
			}

			if (nums[i] < min) {

				min = nums[i];
			}

		}

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > sec_max && nums[i] < max) {

				sec_max = nums[i];
			}

		}

		System.out.print("The even numbers of array list = ");

		int b = 0;

		double sum_2 = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 == 0) {

				System.out.print(nums[i] + ",");

				sum_2 = sum_2 + nums[i];

				b++;
			}

		}

		System.out.println();

		System.out.print("The odd numbers of array list = ");

		int c = 0;
		double sum_3 = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 != 0) {

				System.out.print(nums[i] + ",");

				c++;
			}

			sum_3 = sum_3 + nums[i];
		}

		System.out.println();
		System.out.println("The average of odd numbers = " + sum_3 / c);

		System.out.println("The average of even numbers = " + sum_2 / b);
		System.out.println("The maximum number of array list = " + max);
		System.out.println("The second maximum number of array list = " + sec_max);
		System.out.println("The minumum number of array list = " + min);

		return nums;
	}
	
	public int find_Max_Min_Num(int[] A) {

		int flag = 0;

		int max = 0;

		for (int i = 0; i < A.length; i++) {

			if (A[i] > max) {

				max = A[i];
			}

			flag++;
		}

		System.out.println("The maximum number of array list = " + max);
		System.out.println("The size of array list = " + flag);

		return flag;
	}

	public String manipulation(String str, String str_2) {

		System.out.println("The index of 'o' character is = " + str.indexOf('o'));
		System.out.println("The index of second 'o' character is = " + str.indexOf('o', str.indexOf('o') + 1));
		System.out.println("Is the first String equal to second String = " + str.equals(str_2));
		System.out.println("Is the first String equal to second String after lower casing = "
				+ str.toLowerCase().equals(str_2.toLowerCase()));
		System.out.println("Is the first String equal to second String after upper casing = "
				+ str.toUpperCase().equals(str_2.toUpperCase()));
		System.out.println("The character of the first String between 2 to 7 index = " + str.substring(2, 7));

		String reverse_1 = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			char ch = str.charAt(i);

			reverse_1 = reverse_1 + ch;
		}

		System.out.println("The reverse of the first String with charAt(index) = " + reverse_1);

		String reverse_2 = "";

		String[] strng = str.split("");

		for (int i = strng.length - 1; i >= 0; i--) {

			reverse_2 = reverse_2 + strng[i];
		}

		System.out.println("The reverse of the first String with split() = " + reverse_2);

		String reverse_3 = "";

		char[] ch = str.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {

			reverse_3 = reverse_3 + ch[i];
		}

		System.out.println("The reverse of the first String with toCharArray() = " + reverse_3);

		String reverse_4 = "";

		for (int i = str.length(); i > 0; i--) {

			reverse_4 = reverse_4 + str.substring(i - 1, i);
		}

		System.out.println("The reverse of the first String with substring() = " + reverse_4);

		return str;
	}

	public int[] compare_ArraAnDArrayList() {

		int[] nums = new int[5];

		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;

		System.out.println("The length of the array list = " + nums.length);

		System.out.print("The numbers of array list = ");

		for (int i = 0; i < nums.length; i++) {

			System.out.print(nums[i] + ",");
		}

		System.out.println();

		System.out.print("The numbers of array list as reversed = ");

		for (int i = nums.length - 1; i >= 0; i--) {

			System.out.print(nums[i] + ",");
		}

		System.out.println();

		HashSet<Integer> numbers = new HashSet<Integer>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);

		System.out.println("The length of the HashSet = " + numbers.size());

		System.out.println("The numbers of the HashSet = " + numbers);

		SortedSet<String> list = new TreeSet<String>();

		list.add("John");
		list.add("Alex");
		list.add("Mary");
		list.add("Suzan");
		list.add("Lusy");

		Iterator<String> it = list.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}

		System.out.println("The length of the LinkedHashSet = " + list.size());
		System.out.println("The list of the LinkedHashSet = " + list);

		List<Integer> num = new LinkedList<Integer>();

		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);

		System.out.println("The number of List = " + num);

		Iterator<Integer> it_2 = num.iterator();

		while (it_2.hasNext()) {

			System.out.println(it_2.next());
		}
		return nums;
	}

	public void countries(String country) {

		String capitol;

		switch (country) {

		case "USA":

			capitol = "Washington";

			break;

		case "UK":

			capitol = "London";

			break;

		case "Canada":

			capitol = "Ottowa";

			break;

		case "Turkey":

			capitol = "Ankara";

			break;

		default:

			capitol = "Unknown";

			break;

		}

		System.out.println("The capitol of " + country + " is " + capitol + ".");

		System.out.println();
	}

	public void print_star(int a) {

		for (int i = 0; i < a; i++) {

			for (int j = 0; j < i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}

		for (int i = a; i > 0; i--) {

			for (int j = 0; j < i; j++) {

				System.out.print("* ");
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
	}

	public void calculate_payment() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the price of the item");

		price = scan.nextDouble();

		System.out.println("Enter your payment");

           do {

			payment = scan.nextDouble();

			if (payment < price) {

				System.out.println("Please pay for it $" + (price = price - payment) + " more.");

			} else if (payment > price) {

				System.out.println("Please take your change $" + (payment - price)+" Enjoy your shopping!!!");

				break;

			} else if (price == payment) {

				System.out.println("Enjoy your shopping!!!");

				break;
			}

		}while(true);

	}

	
	public String palidrome(String str) {
		
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			char ch=str.charAt(i);
			
			reverse=reverse+ch;
		}
		
		if(reverse.equalsIgnoreCase(str)) {
			
			System.out.println(str+" is a palidrome");
		}else {
			
			System.out.println(str+" is not a palidrome.");
		}
		return str;
	}
	public static void main(String[] args) {

		Review_Topics obj = new Review_Topics();

		obj.find_numbers(0, 0, 5, 0);
		obj.manipulation("Today is codinG day", "TodaY is Coding Day");
		obj.compare_ArraAnDArrayList();
		obj.countries("USA");
		obj.countries("Canada");
		obj.print_star(6);
		obj.calculate_payment();
		obj.palidrome("Dod");
		int[]A= {1,4,23,67,9,17,78};
		obj.find_Max_Min_Num(A);

	}

}
