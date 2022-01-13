package recap;

import java.util.Scanner;

public class Super_Student {

	String stud_name;
	char degree;
	int first_mark;
	int sec_mark;
	int third_mark;
	int average_mark;

	
	Super_Student(int first_mark, int sec_mark, int third_mark, String stud_name) {

		this.stud_name = stud_name;
		this.first_mark = first_mark;
		this.sec_mark = sec_mark;
		this.third_mark = third_mark;

		System.out.println("We will figure out the degree of math class of " + stud_name+".");
	}

	public void calculate_mark_average(int first_mark, int sec_mark, int third_mark) {

		System.out.println("The average of my math class mark as a local variable is "
				+ ((first_mark + sec_mark + third_mark) / 3) + ".");

		System.out.println("The average of my math class mark as a instance variable is "
				+ ((this.first_mark + this.sec_mark + this.third_mark) / 3) + ".");
	}

	public void identfy_degree() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your average mark of Math class.");

		average_mark = scan.nextInt();

		if (average_mark >= 85) {

			degree = 'A';

		} else if (average_mark >= 70 && average_mark < 85) {

			degree = 'B';

		} else if (average_mark >= 55 && average_mark < 70) {

			degree = 'C';

		} else if (average_mark >= 45 && average_mark < 55) {

			degree = 'D';

		} else {

			degree = 'E';
		}
	}

	public void display() {

		System.out.println("My name is " + this.stud_name + " ,and my math class degree is " + this.degree + ".");
	}

}
