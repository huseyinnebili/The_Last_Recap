package Java_Certificate_Questions;

public class Question_12 {

	public static void doSum(Integer x, Integer y) {

		System.out.println("Integer sum is " + (x + y));

	}

	public static void doSum(double x, double y) {

		System.out.println("double sum is " + (x + y));
	}

	public static void doSum(float x, float y) {

		System.out.println("float sum is " + (x + y));
	}
	
	public static void doSum(int x,int y) {
		
		System.out.println("int sum is "+(x+y));
	}
	
	public static void doDivide(double x,float y) {
		
		System.out.println("double and float divide is "+(x/y));
	}
	public static void main(String[] args) {
		
		doSum(10, 20);
		doSum(10.0, 20.0);
		doSum(10.0f, 20.0f);
		doDivide(20.0, 10.0f);
	}
}
