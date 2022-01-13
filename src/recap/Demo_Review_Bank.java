package recap;

public class Demo_Review_Bank {

	public static void main(String[] args) {

		Review_Bank obj = new Review_Bank();

		Review_Bank obj_2 = new Review_Bank(120000, 2.5);
		obj_2.name = "CapitalOne Bank";
		obj_2.calculate_APR(0);
		obj_2.calculate_total_payment(150000, 2.75, 0, 3);
		obj_2.display_APR_rate();
		//obj_2.display_cal_APR_rate(0);

		System.out.println("==========Info of Chase Bank======");

		Chase obj_4 = new Chase(200000, 2.5, "NJ");

		obj_4.calculate_interest_Chase();

		// Review_Bank obj_3=new Chase();
		// obj_3.calculate_interest(200000, APR, name, total_payment, number_of_year)
	}

}
