package The_Last_Recap;

public class Calculator_With_Return_Type {

	int sum(int a, int b, int c) {

		return a + b + c;
	}

	int minus(int a, int b, int c) {

		return a - b - c;
	}

	int times(int a, int b, int c) {

		return a * b * c;
	}

	double divide(double a, double b, double c) {

		return a / b / c;
	}

	int average(int a, int b, int c) {

		return (a + b + c) / 3;
	}

	int max_num(int a, int b, int c) {

		int max = a;

		if (b > a) {

			max = b;
		}
		if (c > max) {

			max = c;
		}

		return max;
	}

	int min_num(int a, int b, int c) {

		int min = a;

		if (b < min) {

			min = b;
		}

		if (c < min) {

			min = c;
		}

		return min;
	}

	int[] prime() {

		System.out.print("Prime numbers of the array list = ");
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

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

		return nums;
	}

	int[] find_Number(int min_num, int max_num, int sec_max_num) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > max_num) {

				max_num = nums[i];

			}

		}

		System.out.println();
		System.out.println("Maximum number of the list = " + max_num);

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] < max_num && nums[i] > sec_max_num) {

				sec_max_num = nums[i];

			}

		}

		System.out.println("Second maximum number of the list = " + sec_max_num);

		
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] < min_num) {

				min_num = nums[i];

			}

		}

		System.out.println("Minumum number of the list = " + min_num);

		
		
		System.out.print("Even numbers of the array list = ");
		for (int i = 0; i < nums.length; i++) {
			
			if(nums[i]%2==0) {
				
				System.out.print(nums[i]+",");
			}
			
		}
		
		System.out.println();
		System.out.print("Odd numbers of the array list = ");
		
		for (int i = 0; i < nums.length; i++) {
			
			if(nums[i]%2!=0) {
				
				System.out.print(nums[i]+",");
			}
			
		}
		return nums;

	}

	public static void main(String[] args) {

		Calculator_With_Return_Type cal = new Calculator_With_Return_Type();

		System.out.println("Sum of the numbers = " + cal.sum(10, 5, 5));
		System.out.println("Minus of the numbers = " + cal.minus(10, 5, 5));
		System.out.println("Times of the numbers = " + cal.times(10, 5, 5));
		System.out.println("Divide of the numbers = " + cal.divide(10, 5, 5));

		System.out.println("Average of the numbers = " + (cal.average(10, 2, 4)));
		System.out.println("Maximum of the numbers = " + (cal.max_num(12, 16, 15)));
		System.out.println("Minumum of the numbers = " + (cal.min_num(12, 16, 15)));

		cal.prime();
		cal.find_Number(2, 0, 0);

	}
}