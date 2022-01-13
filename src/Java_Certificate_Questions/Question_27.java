package Java_Certificate_Questions;

public class Question_27 {
	
	public int amount,amount_2,amount_3,amount_4;

	Question_27(int amount_4){
		
		this.amount_4=amount_4;
		
		this.amount=100;
		
		amount_2=100;
	}
	
	
	
	public static void main(String[] args) {
		
		
		Question_27 acct=new Question_27(100);
		
		acct.amount_3=100;
		
		System.out.println(acct.amount);
		System.out.println(acct.amount_2);
		System.out.println(acct.amount_3);
		System.out.println(acct.amount_4);
	}
}
