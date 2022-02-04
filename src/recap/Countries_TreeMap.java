package recap;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class Countries_TreeMap {

	public static void main(String[] args) {


		Map<Integer,String>countries=new TreeMap<>();
		
		countries.put(49, "Germany");
		countries.put(39, "Italy");
		countries.put(81, "Japan");
		countries.put(47, "Norway");
		countries.put(1, "United States");
		countries.put(44, "United Kingdom");
		countries.put(90, "Turkey");
 //     countries.put(null, "Spain");   // TreeMap does now allow null key,otherwise it is thrown 'java.lang.NullPointerException' exception.
		countries.put(101, null);
		countries.put(102, null);
		countries.put(90, "Turkiye");
		countries.put(103, null);
		
		
		//TreeMap allows multiple null values.
		//TreeMap does not allow duplicate keys.
		//TreeMap place pairs as alphabetical or ascending order.
		System.out.println(countries);
		
		
		countries.remove(102);
		System.out.println("The map list after removing = "+countries);
		
		
		countries.replace(101, "Angola");
		System.out.println("The map list after replacing = "+countries);
		
		
		//We can get all keys from map and put them into a set.
		Collection<Integer>allKeys=countries.keySet();
		System.out.println("The keys of the map = "+allKeys);
		
		
		//We can get all values from map and put them into a set.
		Collection<String>allValues=countries.values();
		System.out.println("The values of the map = "+allValues);
		
	}

}
