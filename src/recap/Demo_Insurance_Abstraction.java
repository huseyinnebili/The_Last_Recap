package recap;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo_Insurance_Abstraction {

	public static void main(String[] args) {


		ArrayList<Insurance_Abstraction>insurance_lists=new ArrayList<>();
		
		insurance_lists.add(new CarInsurance("Geico", "Honda"));
		insurance_lists.add(new PetInsurance("Cigna", "Dog"));
		insurance_lists.add(new HealthInsurance("Aetna"));
		
		
		Iterator<Insurance_Abstraction>it=insurance_lists.iterator();
		
		while(it.hasNext()) {
			
			Insurance_Abstraction ins=it.next();
			
			ins.getQuote();
			ins.cancelInsurance();
			
			System.out.println("============================");
		}
		
		
		

	}

}
