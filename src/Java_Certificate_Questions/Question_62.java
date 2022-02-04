package Java_Certificate_Questions;

interface Question_62 {

	public void download();

}

interface Readable extends Question_62 {

	public void readBook();
}

abstract class Bookk implements Readable {

	public void readBook() {

		System.out.println("Read Book");
	}
	
	
}

class EBookk extends Bookk {

	public void readBook() {

		System.out.println("Read E-Book");

	}

//	@Override
//	public void download() {
//		// TODO Auto-generated method stub
//
//	}

}