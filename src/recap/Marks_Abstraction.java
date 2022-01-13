package recap;

public abstract class Marks_Abstraction {

	public abstract double getAverage();

}

class Student_X extends Marks_Abstraction {

	double mark1, mark2, mark3;

	Student_X(double mark1, double mark2, double mark3) {

		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}

	@Override
	public double getAverage() {

		return (mark1 + mark2 + mark3) / 3;
	}

}

class Student_Y extends Marks_Abstraction {

	double mark1, mark2, mark3, mark4;

	Student_Y(double mark1, double mark2, double mark3, double mark4) {

		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.mark4 = mark4;
	}

	@Override
	public double getAverage() {

		return (mark1 + mark2 + mark3 + mark4) / 4;
	}

}
