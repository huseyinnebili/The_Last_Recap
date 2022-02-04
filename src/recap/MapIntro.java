package recap;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {

	public static void main(String[] args) {
		
		
		Map<Integer,String>map=new HashMap<>();
		
		System.out.println("The size of the map before adding = "+map.size());
		
		
		map.put(100, "Zlatan");
		map.put(101, "Tomas");
		map.put(102, "Smith");
		map.put(103, "George");
		map.put(104, "Kayla");
		map.put(105, "Vector");
		
	
		System.out.println("The size of map after adding = "+map.size());
		
		System.out.println(map);
		
		
		//When added a duplicate key,then it will be overridden.
		map.put(101, "Albert");
		System.out.println(map);
		//Map does not allow duplicate keys.
		
		
		//We can add duplicate values.
		map.put(106, "Zlatan");
		System.out.println(map);
		//Map allows duplicate values.
		
		
		boolean empty=map.isEmpty();
		System.out.println("Is the map empty? "+empty);
		
		
		//We can retrieve values
		System.out.println("The value of key called '100' = "+map.get(100));
		
		
		//How to remove a value from map
		map.remove(101);
		System.out.println("The list of map after removing = "+map);
		
		
		//How to replace a pair into map
		map.replace(100,"Carlos" );
		System.out.println("The list of map after replacing = "+map);
		
		
		//How about null key in a map
		map.put(null, "Adrian");
		map.put(null, "Sofia");
		System.out.println("The list of map after adding null keys = "+map);
		//HashMap and LinkedHashMap allows maximum of one null key.
		//TreeSet does not allow any null keys.
		
		
		//How about null values in a map
		map.replace(106, null);
		map.put(107, null);
		System.out.println("The list of map after adding null values = "+map);
		//Map(HashMap,LinkedHashMap and TreeMap) allows multiple null values.
		
		
		//How to check if map contains a key and value?
		System.out.println("Checking if the map contains a key = "+map.containsKey(100));
		System.out.println("Checking if the map contains a value = "+map.containsValue(null));
		

	}

}
