package recap;

public class Demo_Bank {

	public static void main(String[] args) {

		Bank bank=new Bank();
		Bank.display_bank();
		
		
		
		CapitalOne capitalone=new CapitalOne(0,  12500,  143,  0,  "NJ","CapitalOne",false);
		
		capitalone.number_of_day=155;
		capitalone.state="NY";
		capitalone.principal=13500;
		capitalone.calculate_interest_of_CapitalOne();
		capitalone.specify_of_interest_rate();
	

		BankofAmerica bank_of_America=new BankofAmerica(0,  12500,  143,  0,  "CA","BankofAmerica",true);
		
		bank_of_America.number_of_day=1250;
		bank_of_America.state="VA";
		bank_of_America.principal=17890;
		bank_of_America.calculate_interest_of_BankofAmerica();
		bank_of_America.specify_of_interest_rate();
	}

}
