package recap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Companies_With_Map {

	public static void main(String[] args) {
		
		Map<Integer,String>com=new HashMap<>();
		
		com.put(100, "Oracle");
		com.put(101, "Apache");
		com.put(103, "IBM");
		com.put(104, "Google");
		com.put(105, "Twitter");
		com.put(105, "Whatsapp");  //it was overridden 
		com.put(null, "Facebook");
		com.put(null, "LinkedIn");
		com.put(106, null);
		com.put(107, null);
		
		System.out.println(com);
		
		//Updating the 104th key
		com.replace(104,"Zephry");
		System.out.println("The map list after replacing = "+com);
		
		
		//Removing the 101th key
		com.remove(101);
		System.out.println("The map list after removing = "+com);
		
		
		System.out.println("Is the map empty? "+com.isEmpty());
		
		System.out.println("Does the map contain 106th key ? "+com.containsKey(106));
		
		System.out.println("Does the map contain 'LinkedIn' value ? "+com.containsValue("LinkedIn"));
		
		
		//We can get all keys from map and put them into a set.
		Collection<Integer>allKeys=com.keySet();
		System.out.println("The keys of the map = "+allKeys);
		
		
		//We can get all values from map and put them into a set.
		Collection<String>allValues=com.values();
		System.out.println("The values of the map = "+allValues);
		
		
		

	}

}
