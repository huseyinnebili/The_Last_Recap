package recap;

public class Review_Bank {

	String name;
	double base_APR;
	double principal;
	double total_payment;
	int number_of_year;
	double cal_APR;

	Review_Bank() {

		System.out.println("We will calculate the interest amount of the banks.");
	}

	Review_Bank(double principal, double base_APR) {

		this.principal = principal;
		this.base_APR = base_APR;

		System.out.println("The more principal ,the more APR.You can earn %10 more APR for $100K and above.");

	}

	public double calculate_APR(double cal_APR) {

		if (principal > 50000 && principal <= 100000) {

			cal_APR = base_APR + (base_APR * 5) / 100;

		} else if (principal >= 100000) {

			cal_APR = base_APR + (base_APR * 10) / 100;
		}

		System.out.println("The base rate of APR is "+base_APR+",and the caltulated APR rate is "+cal_APR+" according to amount of given principal at "+name+ ".");

		return cal_APR;
	}

	public void calculate_total_payment(double principal, double cal_APR, double total_payment, int number_of_year) {

		total_payment = principal + ((principal * cal_APR * number_of_year / 100));

		System.out.println("Anyone can be paid " + total_payment + " total payment for " + number_of_year
				+ " years, if he/she puts $" + principal + " capital to " + name +".");
	}

	public void display_APR_rate() {

		System.out.println("Every bank has different base APR rate.For example:" + name + "'s base APR rate is %"
				+ base_APR + ".");
	}
	
	public void display_cal_APR_rate() {

		System.out.println("Every bank has different calculated APR rate.For example:" + name + " Bank's calculated APR rate is %"
				+ cal_APR + ".");
	}
}

class Chase extends Review_Bank {

	String state;

	protected Chase() {

		System.out.println("Chase bank is a very famous bank in the United State.");
	}

	Chase(double principal, double base_APR, String state) {

		super(principal, base_APR);

		this.state = state;

		System.out.println(
				"Any bank of " + state + " state gives least %" + base_APR + " interest for $1000 , and above.");

	}

	public void calculate_interest_Chase() {

		super.calculate_total_payment(1, 0, 0, 2);

		System.out.println("You can get " + total_payment + " for " + number_of_year + " years, if he/she puts $"
				+ principal + " capital to " + name + " Bank.");
	}

	public void display_APR_rate() {

		System.out.println(name + "bank's APR rate  is " + base_APR + ".");
	}

}