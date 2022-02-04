package Java_Certificate_Questions;

public class Question_70 {

	public static void main(String[] args) {


		int x=10;
		int y=++x;
		int z=0;
		
		System.out.println("x = "+x);
		
		if(y>=10 | y<=++x ) {
		
			z=x;
		}
		else {
			
			z=x++;
		}
		
		System.out.println("z = "+z);

	}

}
