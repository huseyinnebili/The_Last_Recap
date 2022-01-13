package recap;

public abstract class Calculater_Abstraction {

	public abstract void getPrimeNumber();

	public abstract void getMaxNumber();

	public abstract void getSecondMaxNumber();

	public abstract void getMinNumber();

	public void display() {

		System.out.println("We will calculate some arithmetical functions.");
	}

}

class Calculate_Numbers extends Calculater_Abstraction {

	int max_num;
	int min_num=5;
	int sec_max_num;
	int prime;

	@Override
	public void getPrimeNumber() {

		int[] nums = { 12, 32, 3, 1, 6, 43, 71, 37, 83, 91, 13, 113 };

		System.out.print("The prime numbers of the array list = ");

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
			}
		}
		
		System.out.println();

	}

	@Override
	public void getMaxNumber() {

		int[] nums = { 12, 32, 3, 1, 6, 43, 71, 37, 83, 91, 13, 113 };

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > max_num) {

				max_num = nums[i];
			}
		}

		System.out.println();

		System.out.println("The maximum number of the array list = " + max_num);
	}

	@Override
	public void getSecondMaxNumber() {

		int[] nums = { 12, 32, 3, 1, 6, 43, 71, 37, 83, 91, 13, 113 };

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > max_num) {

				max_num = nums[i];
			}

			if (nums[i] > sec_max_num && nums[i] < max_num) {

				sec_max_num = nums[i];
			}
		}

		System.out.println("The second maximum number of the arrya list = " + sec_max_num);
	}

	@Override
	public void getMinNumber() {

		int[] nums = { 12, 32, 3, 1, 6, 43, 71, 37, 83, 91, 13, 113 };

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] < min_num) {

				min_num = nums[i];
			}
		}

		System.out.println("The minumum number of the array list = " + min_num);
	}

	public void display() {

		System.out.println("We calculated prime,max,sec_max,and min num.");
	}

	Calculate_Numbers() {

		
		this.getMaxNumber();
		this.getSecondMaxNumber();
		this.getMinNumber();
		this.getPrimeNumber();

	}

}