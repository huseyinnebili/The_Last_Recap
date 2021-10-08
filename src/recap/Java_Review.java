package recap;

public class Java_Review {

	public int[] find_Number(int max_num, int sec_max_num, int min_num, int prime_num, int even_num, int odd_num) {

		int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > max_num) {

				max_num = nums[i];
			}
		}

		System.out.println("The maximum number of the array list = " + max_num);

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > sec_max_num && nums[i] < max_num) {

				sec_max_num = nums[i];

			}
		}

		System.out.println("The second maximum number of the array list = " + sec_max_num);

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] < min_num) {

				min_num = nums[i];
			}
		}
		System.out.println("The minumum number of the array list = " + min_num);

		System.out.print("The prime numbers of the array list = ");

		for (int i = 0; i < nums.length; i++) {

			int count = 0;

			if (nums[i] == 0 || nums[i] == 1) {

				continue;
			}

			for (int j = 2; j < nums[i]; j++) {

				if (nums[i] % j == 0) {

					count = count + 1;

				}
			}

			if (count == 0) {

				System.out.print(nums[i] + ",");
			}
		}

		System.out.println();
		System.out.print("Even numbers of the array list = ");

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 == 0) {

				System.out.print(nums[i] + ",");
			}
		}

		System.out.println();
		System.out.print("Odd numbers of the array list = ");

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 != 0) {

				System.out.print(nums[i] + ",");
			}
		}
		System.out.println();
		return nums;
	}

	public String manipulation(String str) {

		System.out.println("The lenght of the String = " + str.length());
		System.out.println("The first character of the String = " + str.charAt(0));
		System.out.println("The last character of the String = " + str.charAt(15));
		System.out.println("The index of first 'o' character = " + str.indexOf('o'));
		System.out.println("The index of second 'o' character = " + str.indexOf('o', str.indexOf('o') + 1));
		System.out.println("The String after replacement = " + str.replace('D', 'd'));
		System.out.println("The current String  = " + str);
		System.out.println("The String after uppercase = " + str.toUpperCase());
		System.out.println("The String after lower case = " + str.toLowerCase());
		System.out.println("The character are between 2 and 10 index = " + str.substring(2, 10));

		String reverse = "";

		char[] ch = str.toCharArray();

		for (int i = str.length() - 1; i >= 0; i--) {

			reverse = reverse + ch[i];

		}
		System.out.println("The reverse of the String with to CharArray() = " + reverse);

		String reverse_2 = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			char chr = str.charAt(i);
			reverse_2 = reverse_2 + chr;

		}

		System.out.println("The reverse of the String with to charAt(index) = " + reverse_2);

		String reverse_3 = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			String[] strng = str.split("");

			reverse_3 = reverse_3 + strng[i];

		}
		System.out.println("The reverse of the String with split() = " + reverse_3);

		String reverse_4 = "";

		for (int i = str.length(); i > 0; i--) {

			reverse_4 = reverse_4 + str.substring(i - 1, i);
		}

		System.out.println("The reverse of the String with substring = " + reverse_4);
		return str;

	}

	public int print_star_pattern(int a) {

		for (int i = 0; i <= a; i++) {

			for (int j = 0; j < i; j++) {

				System.out.print("*");

			}

			System.out.println();
		}
		for (int i = a; i > 0; i--) {

			for (int j = 0; j < i; j++) {

				System.out.print("$");

			}

			System.out.println();
		}

//				for(int i=0;i<a;i++) {
//					
//					for(int j=a-i;j>0;j--) {
//						
//						System.out.print(" ");
//					}
//					
//					for(int j=0;j<i;j++) {
//						
//						System.out.print("* ");
//					}
//					
//					System.out.println();
//				}

		for (int i = 0; i < a; i++) {

			for (int j = a - i; j > 0; j--) {

				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}

//				for(int i=a;i>0;i--) {
//					
//					for(int j=0;j<a-i;j++) {
//						
//						System.out.print(" ");
//					}
//					
//					for(int j=0;j<i;j++) {
//						
//						System.out.print("* ");
//					}
//					
//					System.out.println();
//				}

		for (int i = a; i > 0; i--) {

			for (int j = a - i; j > 0; j--) {

				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}

//				for(int i=0;i<a;i++) {
//					
//					for(int j=0;j<2*(a-i);j++) {
//						
//						System.out.print(" ");
//					}
//					for(int j=0;j<i;j++) {
//						
//						System.out.print("* ");
//					}
//					
//					System.out.println();
//				}

		for (int i = 0; i < a; i++) {

			for (int j = 2 * (a - i); j > 0; j--) {

				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {

				System.out.print("* ");
			}

			System.out.println();

		}
		
		
		
//		for (int i = a; i > 0; i--) {
//
//			for (int j = 0; j < 2 * (a - i); j++) {
//
//				System.out.print(" ");
//			}
//			for (int j = 0; j < i; j++) {
//
//				System.out.print("* ");
//			}
//
//			System.out.println();
//		}

		
		for(int i=a;i>0;i--) {
			
			for(int j=2*(a-i);j>0;j--) {
				 
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++) {
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
		for (int i = 0; i < a; i++) {

			for (int j = 0; j < i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}
		
		
		
		return a;
	}

	public int display(int a) {

		do {

			System.out.println("Sampiyon Besiktas");

			a++;

		} while (a < 3);

		return a;
	}

	public String countries(String country) {

		String capitol = "";

		switch (country) {

		case "USA":

			capitol = "Washington";

			break;

		case "TC":

			capitol = "Ankara";

			break;

		case "UK":

			capitol = "London";

			break;

		case "Germany":

			capitol = "Berlin";

			break;

		case "Italy":

			capitol = "Roma";

			break;

		case "Canada":

			capitol = "Ottowa";

			break;

		default:

			capitol = "Unknown";

			break;
		}

		System.out.println("The " + capitol + " of " + country + " .");
		return country;
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

		Java_Review obj = new Java_Review();

		obj.find_Number(0, 0, 2, 0, 0, 0);
		obj.manipulation("Today is oFF Day");
		obj.print_star_pattern(6);
		obj.display(0);
		obj.countries("USA");
		obj.palidrome("Dod");

	}

}
