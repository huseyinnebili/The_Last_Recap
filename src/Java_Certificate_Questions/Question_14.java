package Java_Certificate_Questions;

public class Question_14 {

	public static void main(String[] args) {

		String str = "Sweat Sweat";
		String str_2 = str.trim().charAt(6) + " " + str.indexOf("Sw", 1);
		System.out.println(str_2);

		String str_3 = str.trim().charAt(0) + " " + str.indexOf('t', 6);
		System.out.println(str_3);

		String str_4 = str.trim().charAt(3) + " " + str.indexOf("w", 3);
		System.out.println(str_4);

		String str_5 = "Hello World";
		System.out.println(str_5.indexOf("r", 7));
		
		String message = new String("Studyopedia provides free learning content!");
	      
	      System.out.println(message);
	      System.out.println("Index of character i: "+message.indexOf( 'i',20 ));
	}
}