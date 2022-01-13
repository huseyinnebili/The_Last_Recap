package recap;

public interface Bank_Interface {

	public void hasVisaCard();

	public void hasMasterCard();

	public void givesBonus();

	public void getAnnualPay();

	public void loanService();

}

class BankOfAmericaBank implements Bank_Interface {

	double principal;
	double simple_int;
	int time;
	double rate;

	BankOfAmericaBank() {

		System.out.println("We will give information about Bank of America.");
	}

	@Override
	public void hasVisaCard() {

		System.out.println("Bank of America provides visa credit cards.");

	}

	@Override
	public void hasMasterCard() {

		System.out.println("Bank of America provides visa credit cards.");
	}

	@Override
	public void givesBonus() {

		System.out.println("Bank of America serves several bonus types such as %3 cash back of purchase.");

	}

	@Override
	public void getAnnualPay() {

		System.out.println("Bank of America has different anual fee for its services providing.");

	}

	@Override
	public void loanService() {

		System.out.println(
				"Bank of America gives different types of loan servises with mortgage ,auto and finance loan.");

	}

	BankOfAmericaBank(double principal, double simple_int, int time, double rate) {

		this.principal = principal;
		this.simple_int = simple_int;
		this.time = time;
		this.rate = rate;

		simple_int = (principal * rate * time) / 100;

		System.out.println("The simple interest of Bank of America is $" + simple_int+".");
	}

}

class American_Express implements Bank_Interface {

	
	double principal;
	double simple_int;
	int time;
	double rate;
	
	American_Express() {

		System.out.println("We will give information about American Express.");
	}

	@Override
	public void hasVisaCard() {

		System.out.println("American Express bank does not service any credit cards as visa card.");

	}

	@Override
	public void hasMasterCard() {

		System.out.println("American Express bank does not service any credit cards as visa card.");

	}

	@Override
	public void givesBonus() {

		System.out.println("American Express serves several bonus types such as %2 cash back of purchase.");

	}

	@Override
	public void getAnnualPay() {

		System.out.println("American Express doesn't charge any fee for its services.");

	}

	@Override
	public void loanService() {

		System.out.println(
				"American Express gives different types of loan servises with mortgage ,auto and finance loan.");
	}
	
	American_Express(double principal, double simple_int, int time, double rate) {

		this.principal = principal;
		this.simple_int = simple_int;
		this.time = time;
		this.rate = rate;

		simple_int = (principal * rate * time) / 100;

		System.out.println("The simple interest of American Express is $" + simple_int+".");
	}

}
