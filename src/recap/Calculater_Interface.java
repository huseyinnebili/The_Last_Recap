package recap;

public interface Calculater_Interface {

	public void getEvenNumbers();

	public void getOddNumbers();

	public void getAverageNumbers();

	public void display();

}

class Calculate_Nums implements Calculater_Interface {

	double average;

	@Override
	public void getEvenNumbers() {

		int[] nums = new int[10];

		nums[0] = 13;
		nums[1] = 3;
		nums[2] = 42;
		nums[3] = 14;
		nums[4] = 6;
		nums[5] = 10;
		nums[6] = 12;
		nums[7] = 9;
		nums[8] = 34;
		nums[9] = 84;

		System.out.print("The even numbers of the array list = ");

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 == 0) {

				System.out.print(nums[i] + ",");
			}
		}

		System.out.println();
	}

	@Override
	public void getOddNumbers() {

		int[] nums = new int[10];

		nums[0] = 13;
		nums[1] = 3;
		nums[2] = 42;
		nums[3] = 14;
		nums[4] = 6;
		nums[5] = 10;
		nums[6] = 12;
		nums[7] = 9;
		nums[8] = 34;
		nums[9] = 84;

		System.out.print("The odd numbers of the array list = ");

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 != 0) {

				System.out.print(nums[i] + ",");
			}

		}

		System.out.println();

	}

	@Override
	public void getAverageNumbers() {

		float sum = 0;
		int count = 0;

		int[] nums = new int[10];

		nums[0] = 13;
		nums[1] = 3;
		nums[2] = 42;
		nums[3] = 14;
		nums[4] = 6;
		nums[5] = 10;
		nums[6] = 12;
		nums[7] = 9;
		nums[8] = 34;
		nums[9] = 84;

		for (int i = 0; i < nums.length; i++) {

			sum = sum + nums[i];

			count++;

		}

		System.out.println("The sum of the array list = "+sum);
		
		System.out.println("The size of the array list = "+count);
		
		average = sum / count;

		System.out.println("The average of the array list = " + average);

	}

	@Override
	public void display() {

		System.out.println("We calculated odd,even numbers and average number of the array list.");

	}

}
