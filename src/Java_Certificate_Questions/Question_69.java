package Java_Certificate_Questions;

public class Question_69 {

	public static void main(String[] args) {
		
		
		String [][]chs=new String[5][2];
		
		chs[0]=new String[2];
		chs[1]=new String[5];
		
		
		
		
		int a=97;
		
		for(int i=0;i<chs.length;i++) {
			
			for(int j=0;j<chs.length;j++) {
				
				chs[i][j]=" "+a;
				
				a++;
			}
		}
		
		for(String[]num:chs) {
			
			for(String number:num) {
				
				System.out.print(number+" ");
			}
			
			System.out.println();
		}

	}

}
