package recap;

public class Grade_Return {

	public int getGrade(int score, char grade) {

		if (score >= 90) {

			grade = 'A';

		} else if (score >= 80) {

			grade = 'B';

		} else if (score >= 70) {

			grade = 'C';

		} else if (score >= 60) {

			grade = 'D';

		} else {

			grade = 'F';

		}

		System.out.println("My score is " + score + " and grade is " + grade + ".");

		return score;
	}

	public static void main(String[] args) {

		Grade_Return sutudent_1 = new Grade_Return();

		sutudent_1.getGrade(65, ' ');

		
		Grade_Return sutudent_2 = new Grade_Return();

		sutudent_2.getGrade(49, ' ');
		
		
		Grade_Return sutudent_3 = new Grade_Return();

		sutudent_3.getGrade(89, ' ');
	}
}
