package recap;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(12);
		numbers.add(15);
		numbers.add(32);
		numbers.add(45);
		
		System.out.println(numbers);

		for ( int i=0;i<numbers.size();i++) {
			
			System.out.print(numbers.get(i)+" ");
		}
		
		System.out.println();
		
		System.out.println(numbers.get(2));
		
		System.out.println(numbers.contains(45));

		
		ArrayList<String >names=new ArrayList<>();
		
		names.add("Zlatan");
		names.add("Bob");
		names.add("Joe");
		names.add("Henrich");
		names.add("Karl");
		
		
		System.out.println("Is the arraylist empty?"+ names.isEmpty());
		System.out.println("Does it contain Henrich?"+names.contains("Henrich"));
		System.out.println("The siz eof the arraylist is "+names.size()+".");
	}

}