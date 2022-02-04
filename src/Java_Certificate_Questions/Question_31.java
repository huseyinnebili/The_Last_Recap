package Java_Certificate_Questions;

public class Question_31 {

	public static void main(String[] args) {


		int array1[]= {1,2,3};
		
	   int array2[]=new int[5];
	   
	   System.out.println(array2.length);//5
		
		array2=array1;
		
		 System.out.println(array2.length);//3
		 
		for(int i:array2) {
			
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		int array3[]=new int[1];
		
		array3=array2;
		
		for(int i:array3) {
			
			System.out.print(i+" ");
		}

	}

}
