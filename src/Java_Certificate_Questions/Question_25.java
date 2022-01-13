package Java_Certificate_Questions;

public class Question_25 {

	public static void main(String[] args) {

		int nums1[] = { 1, 2, 3 };
		int nums2[] = { 1, 2, 3, 4, 5 };

		nums2 = nums1;

		for (int x : nums2) {

			//System.out.print(x + ":");
		}

		System.out.println();

		int nums3[] = { 1, 2, 3 };
		int nums4[] = { 1, 2, 3, 4, 5 };

		nums3 = nums4;

		for (int y : nums3) {

			System.out.print(y + ":");
		}
	}

}
