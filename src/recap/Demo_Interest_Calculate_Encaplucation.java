package recap;

public class Demo_Interest_Calculate_Encaplucation {

	public static void main(String[] args) {

		Interest_Calculate_Encaplucation obj = new Interest_Calculate_Encaplucation();

		System.out.println("======Calculating of Mortgage Loan Total Payment=======");

		obj.setTotal_mortgage_loan__payment(0);

		obj.getTotal_mortgage_loan__payment();

		System.out.println();

		System.out.println("======Calculating of Auto Loan Total Payment=======");
		
		obj.setTotal_auto_loan_payment(0);
		
		obj.getTotal_auto_loan_payment();
		
		System.out.println();

		System.out.println("======Calculating of Personal Loan Total Payment=======");
		
		obj.setTotal_personal_loan_payment(0);
		
		obj.getTotal_personal_loan_payment();
	}

}
