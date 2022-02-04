package Java_Certificate_Questions;

public class Question_53 {

	public static void main(String[] args) {

		int num[][] = new int[1][3];

		// num[i][j]=10 is equal to below process.
		num[0][0] = 10;
		num[0][1] = 10;
		num[0][2] = 10;
	//  num[0][3] = 10; // it is thrown java.lang.ArrayIndexOutOfBoundsException: 3

		//System.out.println(num.length);

		for (int i = 0; i < num.length; i++) {

			for (int j = 0; j < num.length; j++) {

				// num[i][j]=10;

				//System.out.println(num[i][j] + " ");

			}
		}

		for (int nums[] : num) {

			for (int nm : nums) {

				 System.out.print(nm + " ");
			}

			System.out.println();
		}
		
      System.out.println("=======================");
		
		int[][] nums = new int[3][3];

		//It will be returned as '0' for third columns as we did not insert any values for them.
		nums[0][0] = 10;
		nums[0][1] = 20;
		nums[1][0] = 30;
		nums[1][1] = 40;
		nums[2][0] = 50;
		//nums[3][4] = 60;
	    //nums[2][2] = 70; // it is thrown java.lang.ArrayIndexOutOfBoundsException: 2
		//nums[3][1] = 80; // it is thrown java.lang.ArrayIndexOutOfBoundsException: 3

		for (int i = 0; i < nums.length; i++) {

			//It is thrown java.lang.ArrayIndexOutOfBoundsException if it is exceeded the boundary for both type.
		 //    for (int j = 0; j < nums.length; j++) {
		 //     for (int j = 0; j < nums[i].length; j++) { 
		 //   	System.out.println(nums.length);

			}
		

		for (int[] numm : nums) {

			for (int nm : numm) {

				System.out.print(nm + " ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("=======================");
		
		String[][] numbers = new String[3][];
		
		numbers[0]=new String[3];
		numbers[1]=new String[4];
		numbers[2]=new String[5];
		

		//It will be displayed as '0' for third columns as we did not insert any values for them.
//		numbers[0][0] = 10;
//		numbers[0][1] = 20;
//		numbers[1][0] = 30;
//		numbers[1][1] = 40;
//		numbers[2][0] = 50;
//		numbers[2][1] = 60;
//	    numbers[3][1] = 80; // it is thrown java.lang.ArrayIndexOutOfBoundsException: 3
//      numbers[2][3] = 80; // it is thrown java.lang.ArrayIndexOutOfBoundsException: 3

		
		int b=10;
		
		for (int i = 0; i < numbers.length; i++) {

			//It is thrown java.lang.ArrayIndexOutOfBoundsException if it is exceeded the boundary for both type.
		   for (int j = 0; j < numbers.length; j++) {
	   //    for (int j = 0; j < numbers[i].length; j++) { 

			   numbers[i][j]=" "+b;
			   
			   b+=10;
			}
		}

		for (String[] number : numbers) {

			for (String nmbr : number) {

				System.out.print(nmbr + " ");
			}
			System.out.println();
		}

	}

}
