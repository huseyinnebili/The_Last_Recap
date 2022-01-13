package recap;

public class Bank {

	protected double interest_rate;
	public int principal;
	protected double total_payment;
	protected int number_of_day;
	public String state;
    String bank_name;

	Bank() {

		System.out.println("We will calculate the interest rate of te different banks.");
	}

	public static void display_bank() {
		
		System.out.println("The banks give different interest for their customers depending on principal,state,number of day, and name of bank.");
	}
	protected Bank(double total_payment, int principal, int number_of_day, double interest_rate, String state,
			String bank_name) {

		this.principal = principal;
		this.total_payment = total_payment;
		this.number_of_day = number_of_day;
		this.interest_rate = interest_rate;
		this.state = state;
		this.bank_name = bank_name;
	}

	 void specify_of_interest_rate() {

		if (state.equalsIgnoreCase("NY")) {

			if (bank_name.equalsIgnoreCase("CapitalOne")) {

				interest_rate = 0.61;

			} else if (bank_name.equalsIgnoreCase("Bank of America")) {

				interest_rate = 0.65;

			} else if (bank_name.equalsIgnoreCase("Wells Fargo")) {

				interest_rate = 0.68;

			} else {

				interest_rate = 0.58;
			}

		}

		else if (state.equalsIgnoreCase("NJ")) {

			if (bank_name.equalsIgnoreCase("CapitalOne")) {

				interest_rate = 0.55;

			} else if (bank_name.equalsIgnoreCase("Bank of America")) {

				interest_rate = 0.58;

			} else if (bank_name.equalsIgnoreCase("Wells Fargo")) {

				interest_rate = 0.52;

			} else {

				interest_rate = 0.5;
			}

		}

		else if (state.equalsIgnoreCase("CA")) {

			if (bank_name.equalsIgnoreCase("CapitalOne")) {

				interest_rate = 0.67;

			} else if (bank_name.equalsIgnoreCase("BankofAmerica")) {

				interest_rate = 0.7;

			} else if (bank_name.equalsIgnoreCase("WellsFargo")) {

				interest_rate = 0.75;

			} else {

				interest_rate = 0.62;
			}

		} else {

			interest_rate = 0.5;
		}

	}

	public  void total_payment() {

		total_payment = principal + ((principal * interest_rate * number_of_day) / 365);

	}
}

class CapitalOne extends Bank {

	boolean isBonus;

	public CapitalOne(double total_payment, int principal, int number_of_day, double interest_rate, String state,
			String name_of_bank, boolean isBonus) {

		super(total_payment, principal, number_of_day, interest_rate, state, name_of_bank);

		this.isBonus = isBonus;

	}

	public void calculate_interest_of_CapitalOne() {

		super.specify_of_interest_rate();

		super.total_payment();

		System.out
				.println("The interest rate of the " + bank_name + " bank of " + state + " is  " + interest_rate + ".");

		System.out.println("Anyone is paid  $" + total_payment + " for $" + principal + " in " + number_of_day
				+ " days at " + bank_name + " bank of " + state + ".");
       
		System.out.println(
				"Does " + bank_name + " give any bonus for over principal ?(true/false = )" + isBonus);
	}

}

class BankofAmerica extends Bank {

	boolean isFee;

	public BankofAmerica(double total_payment, int principal, int number_of_day, double interest_rate, String state,
			String name_of_bank, boolean isFee) {

		super(total_payment, principal, number_of_day, interest_rate, state, name_of_bank);

		this.isFee = isFee;

		System.out.println(
				"Does " + name_of_bank + " charge any fee for its service with interest?(true/false = )" + isFee);
	}

	public void calculate_interest_of_BankofAmerica() {

		super.specify_of_interest_rate();
		super.total_payment();

		System.out
				.println("The interest rate of the " + bank_name + " bank of " + state + " is  " + interest_rate + ".");

		System.out.println("Anyone is paid  $" + total_payment + " for $" + principal + " in " + number_of_day
				+ " days at " + bank_name + " bank of " + state + ".");

	}

}