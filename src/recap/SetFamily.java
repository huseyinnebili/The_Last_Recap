package recap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetFamily {

	public static void main(String[] args) {

		
		System.out.println("========HashSet==========");

		// No duplicates,max one null value,random order.
		Set<String> foods = new HashSet<>();

		foods.add("eggs");
		foods.add("bread");
		foods.add("tomato");
		foods.add("meat");
		foods.add("tea");
		foods.add(null);
		foods.add("meat");
		foods.add(null);

		System.out.println(foods.size());

		System.out.println(foods);

		System.out.println("=========Iterator======");

		Iterator<String> it = foods.iterator();

		while (it.hasNext()) {

			String food = it.next();

			System.out.println(food);

		}
		
		
		
		System.out.println("========LinkedHashSet==========");

		// No duplicates,max one null value,insertion order.
		Set<String> foods_2 = new LinkedHashSet<>();

		foods_2.add("eggs");
		foods_2.add("bread");
		foods_2.add("tomato");
		foods_2.add("meat");
		foods_2.add("tea");
		foods_2.add(null);
		foods_2.add("meat");
		foods_2.add(null);

		System.out.println(foods_2.size());

		System.out.println(foods_2);
		
		

		System.out.println("========TreeSet==========");

		// No duplicates,none null value otherwise thrown exception,ascending or
		// alphabetical order.
		Set<String> foods_3 = new TreeSet<>();

		foods_3.add("eggs");
		foods_3.add("bread");
		foods_3.add("tomato");
		foods_3.add("meat");
		foods_3.add("tea");
		//foods_3.add(null); //TreeSet does not allow null values so it is thrown java.lang.NullPointerException exception.
		foods_3.add("meat");
		//foods_3.add(null);

		System.out.println(foods_3.size());

		System.out.println(foods_3);
	}
}
