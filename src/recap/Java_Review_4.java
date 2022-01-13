package recap;

import java.util.Scanner;

public class Java_Review_4 {

	static Scanner scan;

	public int[] calculate(float add, float average, double mul, int div, int sub, int max, int sec_max, int min,
			int even, int odd, float average_of_even, float sum_even_num, float sum_odd_num, float average_of_odd) {

		scan = new Scanner(System.in);

		System.out.println("Please enter 10 digits randomly.");

		int[] numbers = new int[10];

		int a = 0;

		for (int i = 0; i < numbers.length; i++) {

			numbers[i] = scan.nextInt();

			add = add + numbers[i];

			a++;
		}

		average = add / a;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > max) {

				max = numbers[i];
			}

			if (numbers[i] < min) {

				min = numbers[i];
			}

			div = max / min;
		}

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > sec_max && numbers[i] < max) {

				sec_max = numbers[i];
			}

			sub = max - sec_max;
		}

		System.out.print("The prime numbers of the array list = ");

		for (int i = 0; i < numbers.length; i++) {

			int count = 0;

			if (numbers[i] == 0 || numbers[i] == 1) {

				continue;
			}

			for (int j = 2; j <= numbers[i] / 2; j++) {

				if (numbers[i] % j == 0) {

					count = count + 1;
				}
			}

			if (count == 0) {

				System.out.print(numbers[i] + ",");

			}

		}

		System.out.println();

		System.out.print("The even numbers of the array list = ");

		int b = 0;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] % 2 == 0) {

				System.out.print(numbers[i] + ",");

				sum_even_num = sum_even_num + numbers[i];

				b++;
			}

		}

		average_of_even = sum_even_num / b;

		System.out.println();

		System.out.print("The odd numbers of the array list = ");

		int c = 0;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] % 2 != 0) {

				odd = numbers[i];

				System.out.print(odd + ",");

				sum_odd_num = sum_odd_num + odd;

				c++;

			}

		}

		average_of_odd = sum_odd_num / c;

		System.out.println();
		System.out.println("The sum of array list = " + add);
		System.out.println("The average of array list = " + average);
		System.out.println("The max number of array list = " + max);
		System.out.println("The min number of array list = " + min);
		System.out.println("The div of " + max + ",and " + min + " = " + div);
		System.out.println("The sec max number of array list = " + sec_max);
		System.out.println("The sub of " + max + ",and " + sec_max + " = " + sub);
		System.out.println("The sum of even number = " + sum_even_num);
		System.out.println("The average of even numbers = " + average_of_even);
		System.out.println("The sum of odd number = " + sum_odd_num);
		System.out.println("The average of odd numbers = " + average_of_odd);

		return numbers;
	}

	
	public String manipulation(String str,String str_2) {
		
		System.out.println("The index of 'o' character = "+str.indexOf('o'));
		System.out.println("The index of second 'o' character = "+str.indexOf('o',str.indexOf('o')+1));
		System.out.println("Does the first String equal the second String?"+str.equals(str_2));
		System.out.println("The first String after uppering case = "+str.toUpperCase());
		System.out.println("The second String after uppering case = "+str_2.toUpperCase());
		System.out.println("Does the first String equal the second String?"+str.toLowerCase().equals(str_2.toLowerCase()));	
		System.out.println("The character of between 2 to 7 index of the first String = "+str.substring(2, 7));
	
		
		String reverse_1="";
		
		String []strng=str.split("");
		
		for(int i=strng.length-1;i>=0;i--) {
			
			reverse_1=reverse_1+strng[i];
		}
		
		System.out.println("The reverse of the first String with split() = "+reverse_1);
		
		
		String reverse_2="";
		
		char []ch=str.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			
			reverse_2=reverse_2+ch[i];
		}
		
		System.out.println("The reverse of the first String with toCharArray() = "+reverse_2);
		
		
		String reverse_3="";
		
		
		for(int i=str.length()-1;i>=0;i--) {
		
		char chr=str.charAt(i);
		
		reverse_3=reverse_3+chr;
	
		}
		
		System.out.println("The reverse of the first String with toCharAt(index) = "+reverse_3);
		
		String reverse_4="";
		
		for(int i=str.length();i>0;i--) {
			
			
			reverse_4=reverse_4+str.substring(i-1, i);	
			
		}
		
		System.out.println("The reverse of the first String with substring = "+reverse_4);
		
		return str;
	}
	
	public static void main(String[] args) {

		Java_Review_4 obj = new Java_Review_4();

		obj.calculate(0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0);
		
		obj.manipulation("Today is Coding day", "Today is codInG day");
	}

}
