package Java_Certificate_Questions;

interface Question_60 {

	public void readBook();

	public void setBookMark();

}

abstract class Book implements Question_60 {

	public void readBook() {

	}

	abstract void display();
}

class EBook extends Book {

	@Override
	void display() {

	}

	@Override
	public void setBookMark() {

	}

}
