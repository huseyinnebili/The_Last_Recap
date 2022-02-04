package Java_Certificate_Questions;

public class Question_52 {

	public static void main(String[] args) {

//		String[][] chs = new String[3][];
//		
//		chs[0] = new String[4]; // i=3 numbers  j=2 (0,1,2) => 3 numbers
//		chs[1] = new String[4]; // i=3 numbers  j=2 (0,1,2) => 3 numbers
//		chs[2] = new String[4]; // i=3 numbers  j=2 (0,1,2) => 3 numbers

		String[][] chs = new String[2][];

		chs[0] = new String[2]; // i=2 numbers j=1 (0,1) => j = 2 numbers so it will return 2 int.(i=j=2
								// numbers)
		chs[1] = new String[5]; // i=5 numbers j=1 (0,1) => j = 2 numbers so it will return 2 int and 3 null
								// values.(i=5 numbers ,j=2 numbers)

		int a = 97;

		//System.out.println(chs.length);

		for (int i = 0; i < chs.length; i++) {

		//	System.out.println("The legth of chs[i] = " + chs[i].length);

			for (int j = 0; j < chs.length; j++) {

				chs[i][j] = " " + a;

				a++;

			}
		}

		for (String[] ca : chs) {

			for (String c : ca) {

				System.out.print(c + " ");
			}

			System.out.println();
		}

//		
//		String [][] text=new String [4][];
//		
//		text[0]=new String[5]; //i=5  j=4  j=3
//		text[1]=new String[4]; //i=4  j=3  j=3
//		text[2]=new String[3]; //i=3  j=2  j=3
//		text[3]=new String[3]; //i=3  j=2  j=3
//		
//		text[0][0]="A";
//		text[0][1]="B";
//		text[1][0]="C";
//		text[1][1]="D";
//		
//		System.out.println(text.length); //3
//		
//		for(int i=0;i<text.length;i++) {
//			
//			//System.out.println("The length of text[i] = "+text[i].length);
//			
//			for(int j=0;j<text[i].length;j++) {
//				
//				
//			System.out.print(text[i][j]+"\t");
//			}
//		}

		
	}

}
