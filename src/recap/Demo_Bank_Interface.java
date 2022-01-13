package recap;

public class Demo_Bank_Interface {

	public static void main(String[] args) {

		System.out.println("======BankOfAmericaBank========");

		Bank_Interface obj=new BankOfAmericaBank();
		
		obj.getAnnualPay();
		obj.givesBonus();
		obj.hasMasterCard();
		obj.hasVisaCard();
		obj.loanService();
	
		BankOfAmericaBank obj_2=new BankOfAmericaBank(2000, 0, 2, 2.13); 
		

		System.out.println("=========AmericanExpress===========");
		
		Bank_Interface obj_3= new American_Express();
		
		obj_3.getAnnualPay();
		obj_3.givesBonus();
		obj_3.hasMasterCard();
		obj_3.hasVisaCard();
		obj_3.loanService();
		
		
		American_Express obj_4= new American_Express(10000, 0, 3, 2.15) ;
	}

}
