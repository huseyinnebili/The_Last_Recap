package recap;

public class Demo_Calculater_Abstraction {

	public static void main(String[] args) {

		Calculater_Abstraction obj = new Calculate_Numbers();

		obj.getMaxNumber();
		obj.getSecondMaxNumber();
		obj.getMinNumber();
		obj.getPrimeNumber();
		obj.display();

	}

}
