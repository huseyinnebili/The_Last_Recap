package Java_Certificate_Questions;

public class Question_61 {

	public static void main(String[] args) {
		
		int []array= {1,2,3,4,5};
		
		for(int i=0;i<array.length;i++) {
			
			System.out.print(array[i]+" ");
		}
		
		System.out.println();
		
		for(int i=array.length-1;i>=0;i--) {
			
			System.out.print(array[i]+" ");
		}
		
		System.out.println();
		
		for(int ar:array) {
			
			System.out.print(ar+" ");
		}

	}

}
