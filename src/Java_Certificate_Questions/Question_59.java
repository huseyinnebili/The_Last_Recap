package Java_Certificate_Questions;

public class Question_59 {

	public static void main(String[] args) {

		double discount = 0;

		int qty = 95;

		
		//correct statement
		
//		if(qty>80 && qty<90) {
//			
//			discount=0.2;
//		
//		}else if(qty>=90){	
//			
//			discount=0.5;
//		
//		}else {
//			
//			discount=0;
//		}

		
		//correct statement
//		if (qty >= 90) {
//
//			discount = 0.5;
//
//		}
//
//		if (qty > 80 && qty < 90) {
//
//			discount = 0.2;
//
//		}
		
		//correct statement
//   	discount=(qty>=90)?0.5:(qty>80)?0.2:0;
		
		
		//incorrect statement
//		discount=(qty>80)?0.2:(qty>=90)?0.5:0;  //it will return 0.2 for  discount even if qty is greater than or equal to 90.
		
		
		
		//incorrect statement
//		discount=(qty>=90)?0.5:0;
//		discount=(qty>80)?0.2:0;  //it will return 0.2 for  discount even if qty is greater than or equal to 90.

		
		
		//incorrect statement
//		discount=(qty>80)?0.2:0;
//		discount=(qty>=90)?0.5:0;  //it will always return 0.0 for discount when  qty is less than 90.
		
		
		
		
		
		
		System.out.println(discount);
	}

}
