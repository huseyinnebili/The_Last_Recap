package recap;

public class Numbers {

	int a, b,c;
	int average;
	int max_num, sec_max_num, min_num;
	String name;
	double num;
	boolean isDisplay;

	Numbers() {

		System.out.println("We will do some mathmetical operations.");
	}

	Numbers(int a, int b, int average) {

		this.a = a;
		this.b = b;
		this.average = average;

		average = (a + b) / 2;

		System.out.println("The average of " + a + ", and " + b + " =" + average);
	}

	Numbers(int max_num, int sec_max_num, int min_num, String name) {

		this(10, 20, 0);

		this.max_num = max_num;
		this.sec_max_num = sec_max_num;
		this.min_num = min_num;

		int[] nums = { 13, 11, 3, 17, 32, 43, 57, 53, 69, 12, 341, 511, -12 };

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > max_num) {

				max_num = nums[i];

			}
		}

		System.out.println("The maximum number of the array-list = " + max_num);

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > sec_max_num && nums[i] < max_num) {

				sec_max_num = nums[i];

			}
		}

		System.out.println("The second maximum number of the array-list = " + sec_max_num);

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] < min_num) {

				min_num = nums[i];

			}

		}

		System.out.println("The minumum number of the array-list = " + min_num);

	}

	Numbers(int a, String name) {

		this.a = a;
		this.name = name;

		for (int i = 0; i < a; i++) {

			for (int j = 0; j < i; j++) {

				System.out.print(" * ");
			}

			System.out.println();
		}

	}

	Numbers(int a, String name, double num) {

		this.a=a;
		this.name=name;
		this.num=num;
		
		for (int i = 0; i < a; i++) {

			for (int j = 2 * (a - i); j >= 0; j--) {

				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}

	}
	
	Numbers(int a,String name,double num,int c,boolean isDisplay){
		
		this.a=a;
		this.name=name;
		this.num=num;
		this.c=c;
		this.isDisplay=isDisplay;
		
		
		for(int i=0;i<a;i++) {
			
			for(int j=a-i;j>=0;j--) {
				
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++) {
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}
}

class Child_Numbers extends Numbers {

	float sum;
	double average;
	int a;
	int odd_num;
	int even_num;
	int prime_num;
	double num;
	int c;
	char ch;

	Child_Numbers(float sum, double average, int a) {

		this.sum = sum;
		this.average = average;
		this.a = a;

		int[] nums = new int[10];

		nums[0] = 2;
		nums[1] = 4;
		nums[2] = 7;
		nums[3] = 11;
		nums[4] = 17;
		nums[5] = 13;
		nums[6] = 19;
		nums[7] = 31;
		nums[8] = 43;
		nums[9] = 101;

		for (int i = 0; i < nums.length; i++) {

			sum = sum + nums[i];

			a++;
		}

		average = sum / a;

		System.out.println("The sum of the array list = " + sum);
		System.out.println("The number of the array list =" + a);
		System.out.println("The average of the array list = " + average);

	}

	Child_Numbers(int max_num, int sec_max_num, int min_num, String name, int odd_num, int even_num, int prime_num) {

		super(0, 0, 3, "Hello");

		this.odd_num = odd_num;
		this.even_num = even_num;
		this.prime_num = prime_num;

		int[] nums = { 1, 2, 3, 12, 43, 31, 54, 6, 73, 35, 27, 87, 85, 94, 101, 134 };

		System.out.print("The even numbers of the array list = ");

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 == 0) {

				System.out.print(nums[i] + ",");
			}
		}

		System.out.println();

		System.out.print("The odd numbers of the array list = ");

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 != 0) {

				System.out.print(nums[i] + ",");
			}
		}

		System.out.println();

		System.out.print("The prime numbers of the array list = ");

		for (int i = 0; i < nums.length; i++) {

			int count = 0;

			if (nums[i] == 0 || nums[i] == 1) {

				continue;
			}

			for (int j = 2; j <= nums[i] / 2; j++) {

				if (nums[i] % j == 0) {

					count = count + 1;
				}

			}

			if (count == 0) {

				System.out.print(nums[i] + ",");
			}
		}
	}

	Child_Numbers(int a, String name, double num) {

		super(6, "Print_Right_Star");

		this.num = num;

		for (int i = a; i >= 0; i--) {

			for (int j = 0; j < i; j++) {

				System.out.print(" * ");
			}

			System.out.println();
		}
	}

	Child_Numbers(int a, String name, double num, int c) {

		super(6, "print_left_star", 0.0);

		this.c = c;

		
		for(int i=a;i>=0;i--) {
			
			for(int j=2*(a-i);j>=0;j--) {
				
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++) {
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	
	Child_Numbers(int a,String name,double num,int c,boolean isDisplay,char ch) {
		
		
		super(6,"print_diamont_star",10.12,0,true);
		
		this.ch=ch;
		
		for(int i=a;i>=0;i--) {
			
			for(int j=a-i;j>=0;j--) {
				
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++) {
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}

}