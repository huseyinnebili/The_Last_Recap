package recap;

import java.util.ArrayList;
import java.util.List;

public class DrinksArrayList {

	public static void main(String[] args) {

		List<String> drinkList = new ArrayList<>();

		drinkList.add("water");
		drinkList.add("tea");
		drinkList.add("gin");
		drinkList.add("milk");
		drinkList.add("soda");
		drinkList.add("juice");

		System.out.println(drinkList);

		for (String drink : drinkList) {

			if (drink.contains("e") || drink.contains("a")) {

				drink = "water";

			}

			System.out.print(drink + "-");

		}

		System.out.println();
		
		System.out.println(drinkList);

		System.out.println("========Replace the values trough for loop =======");

		for (int i = 0; i < drinkList.size(); i++) {

			if (drinkList.get(i).contains("a") || drinkList.get(i).contains("e")) {

				drinkList.set(i, "water");
			}
		}

		System.out.println(drinkList);
	}

}