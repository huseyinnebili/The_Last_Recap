package recap;

public class Main_Method_Overload {
	
	public static void main(String[] args) {
		
		System.out.println("I am main method with String argument array.");
	}
	
	public static void main() {
		
		System.out.println("I am a main method with no arguments.");
	}
	
	public static void main(String name) {

		System.out.println("I am main method with a String parameter.");
	}
	
	public static void main(String[]args,int num) {
		
		System.out.println("I am a main method with String and int parameters.");
		
	}
	
	public static void main(int a) {
		
		System.out.println("I am a main method with an int paremeter.");
		
	}

}
