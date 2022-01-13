package recap;

import java.util.Scanner;

public class Interest_Calculate_Encaplucation {

	private double total_mortgage_loan__payment, total_auto_loan_payment, total_personal_loan_payment;

	int mortgage_loan_amount, auto_loan_amount, personal_loan_amount;
	double mortgage_APR, auto_APR, personal_APR;
	int instalment_num;

	Scanner scan = new Scanner(System.in);

	public double getTotal_mortgage_loan__payment() {
		return total_mortgage_loan__payment;
	}

	public void setTotal_mortgage_loan__payment(double total_mortgage_loan__payment) {

		System.out.println("Please enter the amount of mortgage loan which you need.");

		mortgage_loan_amount = scan.nextInt();

		System.out.println("Please enter the mortgage APR.");

		mortgage_APR = scan.nextDouble();

		System.out.println("Please enter your total instalment months.");

		instalment_num = scan.nextInt();

		total_mortgage_loan__payment = mortgage_loan_amount
				+ (mortgage_loan_amount * mortgage_APR * instalment_num) / 300;

		System.out.print("You will pay back $" + total_mortgage_loan__payment + " for $" + mortgage_loan_amount
				+ " as mortgage loan.");

		this.total_mortgage_loan__payment = total_mortgage_loan__payment;
	}

	public double getTotal_auto_loan_payment() {

		return total_auto_loan_payment;
	}

	public void setTotal_auto_loan_payment(double total_auto_loan_payment) {

		System.out.println("Please enter the amount of auto loan which you need.");

		auto_loan_amount = scan.nextInt();

		System.out.println("Please enter the auto APR.");

		auto_APR = scan.nextDouble();

		System.out.println("Please enter your total instalment months.");

		instalment_num = scan.nextInt();

		total_auto_loan_payment = auto_loan_amount + (auto_loan_amount * auto_APR * instalment_num) / 300;

		System.out.print(
				"You will pay back $" + total_auto_loan_payment + " for $" + auto_loan_amount + " as auto loan.");

		this.total_auto_loan_payment = total_auto_loan_payment;
	}

	public double getTotal_personal_loan_payment() {
		return total_personal_loan_payment;
	}

	public void setTotal_personal_loan_payment(double total_personal_loan_payment) {

		System.out.println("Please enter the amount of personal loan which you need.");

		personal_loan_amount = scan.nextInt();

		System.out.println("Please enter APR of personal loan.");

		personal_APR = scan.nextDouble();

		System.out.println("Please enter your total instalment months");

		instalment_num = scan.nextInt();

		total_personal_loan_payment = personal_loan_amount
				+ (personal_loan_amount * personal_APR * instalment_num) / 300;

		System.out.print("You will pay back $" + total_personal_loan_payment + " for $" + personal_loan_amount
				+ " as personal loan.");

		this.total_personal_loan_payment = total_personal_loan_payment;
	}

}
