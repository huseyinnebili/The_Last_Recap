package recap;

public abstract class Review_All_Topics_With_Abstraction {

	public void display() {

		System.out.println("We will do coding with aritmetic functions in Java as abstract method.");
	}

	public abstract void findMax_Num(int max);

	public abstract void findMin_Num(int min);

	public abstract void findSec_Max_Num(int sec_max, int max_2);

	public abstract void findPrime_Num(int prime);

	public abstract void findEven_Num(int even);

	public abstract void findOdd_Num(int odd);

	public abstract void findAverage_Num(int avg);

}

class Numbers_Abstract extends Review_All_Topics_With_Abstraction {

	int[] arr = { 13, 4, 37, 32, 79, 53, 17, 42, 65, 84, 90 };

	@Override
	public void findMax_Num(int max) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {

				max = arr[i];
			}

		}

		System.out.println("The maximum number of array list = " + max);

	}

	@Override
	public void findMin_Num(int min) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min) {

				min = arr[i];
			}
		}

		System.out.println("The minumum number of array list = " + min);
	}

	@Override
	public void findSec_Max_Num(int sec_max, int max_2) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max_2) {

				max_2 = arr[i];
			}

		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > sec_max && arr[i] < max_2) {

				sec_max = arr[i];
			}
		}

		System.out.println("The maximum number_2 of array list = " + max_2);
		System.out.println("The second maximum number of array list = " + sec_max);

	}

	@Override
	public void findPrime_Num(int prime) {

		System.out.print("The prime number of the array list = ");

		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] <= 1) {

				continue;
			}

			for (int j = 2; j <= arr[i] / 2; j++) {

				if (arr[i] % j == 0) {

					count = count + 1;

				}

			}

			if (count == 0) {

				System.out.print(arr[i] + ",");
			}

		}

	}

	@Override
	public void findEven_Num(int even) {

		System.out.println();

		System.out.print("The even numbers of the array list = ");

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {

				System.out.print(arr[i] + ",");
			}
		}

	}

	@Override
	public void findOdd_Num(int odd) {

		System.out.println();

		System.out.print("The odd numbers of the array list = ");

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 != 0) {

				System.out.print(arr[i] + ",");
			}
		}

	}

	@Override
	public void findAverage_Num(int avg) {

		int count = 0;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];

			count++;
		}
		System.out.println();

		System.out.println("The size of the array list = " + count);
		System.out.println("The sum of the array list = " + sum);
		System.out.println("The average of the array list = " + sum / count);
	}

}