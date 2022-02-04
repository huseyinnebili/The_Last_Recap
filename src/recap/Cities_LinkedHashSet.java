package recap;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Cities_LinkedHashSet {

	public static void main(String[] args) {


		Set<String>cities=new LinkedHashSet<>();
		
		cities.add("Clifton");
		cities.add("Atlantic City");
		cities.add("Newark");
		cities.add("albany");
		cities.add("Passaic");
		cities.add("Passaic");
	
		
		
		System.out.println("The cities before removal = "+cities);
		
		Iterator<String>it=cities.iterator();
		
		while(it.hasNext()) {
			
			String city=it.next();
			
			
			//1.way
			if(city.toLowerCase().startsWith("a")) {
				
				//it.remove();
			}
			
			
			//2.way
			if(city.toUpperCase().startsWith("A")) {
				
				it.remove();
				
			}
			
			//3.way
			if(city.toUpperCase().charAt(0)=='A') {
				
				//it.remove();
			}
			
		}
		
		System.out.println("The cities after removal = "+cities);
	}

}
