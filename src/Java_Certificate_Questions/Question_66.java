package Java_Certificate_Questions;

public interface Question_66 {

	public void displayI();

}


abstract class C2 implements Question_66{
	
	public void displayC2() {
		
		System.out.print("C2");
	}
	
//	abstract void show();
	
	
//	@Override
//	public void displayI() {
//     
//		System.out.println("C1");
//		
//	}
	
	
}

class C1 extends C2{

	@Override
	public void displayI() {
     
		System.out.print("C1");
		
	}

//	@Override
//	void show() {
//		// TODO Auto-generated method stub
//		
//	}
	
	
}